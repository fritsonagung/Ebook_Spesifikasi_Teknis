package id.co.telkom.ebookspesifikasiteknis.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDistribusi;

public class AdapterSegmentDistribusi extends RecyclerView.Adapter<AdapterSegmentDistribusi.ViewHolder> {
    private static List<ModelSegmentDistribusi> segmentDistribusis;
    private static AdapterSegmentDistribusi.OnCallbackListener listener;


    public AdapterSegmentDistribusi(List<ModelSegmentDistribusi> segmentDistribusis) {
        this.segmentDistribusis = segmentDistribusis;
    }

    @Override
    public AdapterSegmentDistribusi.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AdapterSegmentDistribusi.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(AdapterSegmentDistribusi.ViewHolder holder, int position) {
        ModelSegmentDistribusi segmentDistribusi = segmentDistribusis.get(position);
        holder.judulSegmentDistribusi.setText(segmentDistribusi.getJudul_segment_distribusi());

    }

    @Override
    public int getItemCount() {
        return segmentDistribusis.size();
    }

    public void setOnCallbackListener(AdapterSegmentDistribusi.OnCallbackListener listener) {
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView judulSegmentDistribusi;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            judulSegmentDistribusi = itemView.findViewById(R.id.txt_judul);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(segmentDistribusis.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(ModelSegmentDistribusi segmentDistribusi);
    }
}
