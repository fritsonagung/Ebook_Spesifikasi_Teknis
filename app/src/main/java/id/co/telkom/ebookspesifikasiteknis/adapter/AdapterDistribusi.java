package id.co.telkom.ebookspesifikasiteknis.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.DetailDistribusi;
import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelArtikel;

public class AdapterDistribusi extends RecyclerView.Adapter<AdapterDistribusi.ViewHolder> {

    private List<ModelArtikel> mdistribusiList;
    private Context mcontext;
    private static OnCallbackListener mlistener;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView judul_artikel;
        public TextView isi_artikel;
        public ImageView gambar_artikel;
        public OnCallbackListener mlistener;


        public ViewHolder(View v, OnCallbackListener listener) {
            super(v);

            judul_artikel = v.findViewById(R.id.txt_judul);
            isi_artikel = v.findViewById(R.id.txt_isi);
            gambar_artikel =  v.findViewById(R.id.img_gambar);

            this.mlistener = listener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mlistener.onClick(getAdapterPosition());

            Intent intent = new Intent(mcontext, DetailDistribusi.class);
            intent.putExtra("id_artikel", mdistribusiList.get(getAdapterPosition()).getId_artikel());
            intent.putExtra("judul_artikel", mdistribusiList.get(getAdapterPosition()).getJudul_artikel());
            intent.putExtra("isi_artikel", mdistribusiList.get(getAdapterPosition()).getIsi_artikel());
            intent.putExtra("gambar_artikel", mdistribusiList.get(getAdapterPosition()).getGambar_artikel());
            mcontext.startActivity(intent);
        }
    }

    public AdapterDistribusi(List<ModelArtikel> distribusiList, Context context, OnCallbackListener listener) {
        mdistribusiList = distribusiList;
        mcontext = context;
        mlistener = listener;
    }

    @NonNull
    @Override
    public AdapterDistribusi.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new ViewHolder(itemView, mlistener);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDistribusi.ViewHolder holder, int position) {
        final ModelArtikel segmentDistribusi = mdistribusiList.get(position);
        holder.judul_artikel.setText(segmentDistribusi.getJudul_artikel());
    }

    @Override
    public int getItemCount() {
        if (mdistribusiList == null || mdistribusiList.size() == 0) {
            return 0;
        } else {
            return mdistribusiList.size();
        }
    }

    public interface OnCallbackListener {

        void onClick(int position);
    }
}
