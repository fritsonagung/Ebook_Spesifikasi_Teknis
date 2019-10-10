package id.co.telkom.ebookspesifikasiteknis.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.DetailSegmentDrop;
import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDrop;


public class AdapterSegmentDrop extends RecyclerView.Adapter<AdapterSegmentDrop.ViewHolder> {
    private static List<ModelSegmentDrop> segmentDrops;
    private static OnCallbackListener listener;
    private Context context;

    public AdapterSegmentDrop(Context context, List<ModelSegmentDrop> segmentDrops, OnCallbackListener listener) {
        this.context = context;
        this.segmentDrops = segmentDrops;
        this.listener= listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);

        return new ViewHolder(itemView, listener);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final ModelSegmentDrop segmentDrop = segmentDrops.get(position);
        holder.judul.setText(segmentDrop.getJudul_segment_drop());
    }


    @Override
    public int getItemCount() {
        if (segmentDrops == null || segmentDrops.size() == 0) {
            return 0;
        } else {
            return segmentDrops.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView judul, materi;
        ImageView gambar;
        OnCallbackListener listener;

        public ViewHolder(View v, OnCallbackListener listener) {
            super(v);

            judul = v.findViewById(R.id.txt_judul);
            materi = v.findViewById(R.id.txt_materi);
            gambar = v.findViewById(R.id.img_gambar);
            this.listener = listener;

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            listener.onClick(getAdapterPosition());

            Intent intent = new Intent(context, DetailSegmentDrop.class);
            intent.putExtra("Segment Drop Item", segmentDrops.get(getAdapterPosition()));
            context.startActivity(intent);
        }
    }

    public interface OnCallbackListener {

        void onClick(int position);
    }
}
