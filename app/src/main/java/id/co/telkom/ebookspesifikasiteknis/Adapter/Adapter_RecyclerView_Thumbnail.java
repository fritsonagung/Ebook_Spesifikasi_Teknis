package id.co.telkom.ebookspesifikasiteknis.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.co.telkom.ebookspesifikasiteknis.Model.Model_Thumbnail;
import id.co.telkom.ebookspesifikasiteknis.R;

public class Adapter_RecyclerView_Thumbnail extends RecyclerView.Adapter<Adapter_RecyclerView_Thumbnail.SolatViewHolder>{
    private Context context;
    private ArrayList<Model_Thumbnail> listSolat;

    private ArrayList<Model_Thumbnail> getListSolat() {
        return listSolat;
    }

    public void setListSolat(ArrayList<Model_Thumbnail> listSolat) {
        this.listSolat = listSolat;
    }

    public Adapter_RecyclerView_Thumbnail(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public SolatViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_thumbnail, viewGroup, false);

        return new SolatViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull SolatViewHolder solatViewHolder, int i) {
        solatViewHolder.jadwal.setText(getListSolat().get(i).getJadwal());
        solatViewHolder.waktu.setText(getListSolat().get(i).getWaktu());
    }

    @Override
    public int getItemCount() {
        return getListSolat().size();
    }

    class SolatViewHolder extends RecyclerView.ViewHolder {
        TextView jadwal, waktu;

        public SolatViewHolder(@NonNull View itemView) {
            super(itemView);

            jadwal = itemView.findViewById(R.id.txt_jadwal_solat);
            waktu = itemView.findViewById(R.id.txt_waktu_solat);


        }
    }

}
