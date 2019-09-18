package id.co.telkom.ebookspesifikasiteknis.ui.SegmentDrop;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import id.co.telkom.ebookspesifikasiteknis.R;

public class SegmentDropFragment extends Fragment {

    private SegmentDropViewModel dropViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
            dropViewModel =
                    ViewModelProviders.of(this).get(SegmentDropViewModel.class);
            View root = inflater.inflate(R.layout.fragment_segment_drop, container, false);
            final TextView textView = root.findViewById(R.id.text_drop);
            dropViewModel.getText().observe(this, new Observer<String>() {
                @Override
                public void onChanged(@Nullable String s) {
                    textView.setText(s);
                }
            });
            return root;
        }
    }