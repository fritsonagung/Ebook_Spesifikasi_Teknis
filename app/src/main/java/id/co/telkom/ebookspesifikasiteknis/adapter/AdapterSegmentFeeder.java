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

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.DetailSegmentFeeder;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentFeeder;

public class AdapterSegmentFeeder extends RecyclerView.Adapter<AdapterSegmentFeeder.ViewHolder> {
    private static List<ModelSegmentFeeder> segmentFeeders;
    private static OnCallbackListener listener;
    private Context context;

    public AdapterSegmentFeeder(Context context, List<ModelSegmentFeeder> segmentFeeders, OnCallbackListener listener) {
        this.context = context;
        this.segmentFeeders = segmentFeeders;
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
        final ModelSegmentFeeder segmentFeeder = segmentFeeders.get(position);
        holder.judul.setText(segmentFeeder.getJudul_segment_feeder());
    }


    @Override
    public int getItemCount() {
        if (segmentFeeders == null || segmentFeeders.size() == 0) {
            return 0;
        } else {
            return segmentFeeders.size();
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

            Intent intent = new Intent(context, DetailSegmentFeeder.class);
            intent.putExtra("Segment Feeder Item", segmentFeeders.get(getAdapterPosition()));
            context.startActivity(intent);
        }
    }

    public interface OnCallbackListener {

        void onClick(int position);
    }
}
