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

import id.co.telkom.ebookspesifikasiteknis.DetailDrop;
import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelArtikel;

public class AdapterDrop extends RecyclerView.Adapter<AdapterDrop.ViewHolder> {

    private List<ModelArtikel> mdropList;
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

            Intent intent = new Intent(mcontext, DetailDrop.class);
            intent.putExtra("id_artikel", mdropList.get(getAdapterPosition()).getId_artikel());
            intent.putExtra("judul_artikel", mdropList.get(getAdapterPosition()).getJudul_artikel());
            intent.putExtra("isi_artikel", mdropList.get(getAdapterPosition()).getIsi_artikel());
            intent.putExtra("gambar_artikel", mdropList.get(getAdapterPosition()).getGambar_artikel());
            mcontext.startActivity(intent);
        }
    }

    public AdapterDrop(List<ModelArtikel> dropList, Context context, OnCallbackListener listener) {
        mdropList = dropList;
        mcontext = context;
        mlistener = listener;
    }

    @NonNull
    @Override
    public AdapterDrop.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new ViewHolder(itemView, mlistener);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterDrop.ViewHolder holder, int position) {
        final ModelArtikel segmentDrop = mdropList.get(position);
        holder.judul_artikel.setText(segmentDrop.getJudul_artikel());
    }

    @Override
    public int getItemCount() {
        if (mdropList == null || mdropList.size() == 0) {
            return 0;
        } else {
            return mdropList.size();
        }
    }

    public interface OnCallbackListener {

        void onClick(int position);
    }
}
