package id.co.telkom.ebookspesifikasiteknis.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentFeeder;

public class AdapterSegmentFeeder extends RecyclerView.Adapter<AdapterSegmentFeeder.ViewHolder> {
    private static List<ModelSegmentFeeder> segmentFeeders;
    private static AdapterSegmentFeeder.OnCallbackListener listener;


    public AdapterSegmentFeeder(List<ModelSegmentFeeder> segmentFeeders) {
        this.segmentFeeders = segmentFeeders;
    }

    @Override
    public AdapterSegmentFeeder.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AdapterSegmentFeeder.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(AdapterSegmentFeeder.ViewHolder holder, int position) {
        ModelSegmentFeeder segmentFeeder = segmentFeeders.get(position);
        holder.judulSegmentFeeder.setText(segmentFeeder.getJudul_segment_feeder());

    }

    @Override
    public int getItemCount() {
        return segmentFeeders.size();
    }

    public void setOnCallbackListener(AdapterSegmentFeeder.OnCallbackListener listener) {
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView judulSegmentFeeder;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            judulSegmentFeeder = itemView.findViewById(R.id.txt_judul);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(segmentFeeders.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(ModelSegmentFeeder segmentFeeder);
    }
}
