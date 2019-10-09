package id.co.telkom.ebookspesifikasiteknis.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDrop;

public class AdapterSegmentDrop extends RecyclerView.Adapter<AdapterSegmentDrop.ViewHolder> {
    private static List<ModelSegmentDrop> segmentDrops;
    private static AdapterSegmentDrop.OnCallbackListener listener;


    public AdapterSegmentDrop(List<ModelSegmentDrop> segmentDrops) {
        this.segmentDrops = segmentDrops;
    }

    @Override
    public AdapterSegmentDrop.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new AdapterSegmentDrop.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false));
    }

    @Override
    public void onBindViewHolder(AdapterSegmentDrop.ViewHolder holder, int position) {
        ModelSegmentDrop segmentDrop = segmentDrops.get(position);
        holder.judulSegmentDrop.setText(segmentDrop.getJudul_segment_drop());

    }

    @Override
    public int getItemCount() {
        return segmentDrops.size();
    }

    public void setOnCallbackListener(AdapterSegmentDrop.OnCallbackListener listener) {
        this.listener = listener;
    }

    static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView judulSegmentDrop;

        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);

            judulSegmentDrop = itemView.findViewById(R.id.txt_judul);
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClick(segmentDrops.get(getAdapterPosition()));
            }
        }
    }

    public interface OnCallbackListener {

        void onClick(ModelSegmentDrop segmentDrop);
    }
}
