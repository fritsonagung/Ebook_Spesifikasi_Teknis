package id.co.telkom.ebookspesifikasiteknis.ui.Beranda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import id.co.telkom.ebookspesifikasiteknis.Adapter.Adapter_Thumbnail_Item;
import id.co.telkom.ebookspesifikasiteknis.Model.Model_Thumbnail;
import id.co.telkom.ebookspesifikasiteknis.R;

public class BerandaFragment extends Fragment {

    private LinearLayout ftth,feeder,distribusi,drop,simulasi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_beranda, container, false);


        return root;
    }
}