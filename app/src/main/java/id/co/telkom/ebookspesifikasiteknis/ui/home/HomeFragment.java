package id.co.telkom.ebookspesifikasiteknis.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import id.co.telkom.ebookspesifikasiteknis.Adapter.Adapter_RecyclerView_Thumbnail;
import id.co.telkom.ebookspesifikasiteknis.Adapter.Adapter_Thumbnail_Item;
import id.co.telkom.ebookspesifikasiteknis.Model.Model_Thumbnail;
import id.co.telkom.ebookspesifikasiteknis.R;

public class HomeFragment extends Fragment {

    private RecyclerView rvThumb1,rvThumb2;
    private ArrayList<Model_Thumbnail> list;
    private ImageButton viewall, viewall2;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        rvThumb1= root.findViewById(R.id.rv_jadwal_shalat);
        rvThumb2 = root.findViewById(R.id.rv2_jadwal_shalat);
        rvThumb1.setHasFixedSize(true);
        rvThumb2.setHasFixedSize(true);

        //Implementasi dan memanggil data ArrayList
        list = new ArrayList<>();
        list.addAll(Adapter_Thumbnail_Item.getListData());

        showRecyclerListThumbnail();

        return root;
    }

    private void showRecyclerListThumbnail() {

        rvThumb1.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        Adapter_RecyclerView_Thumbnail listSolat = new Adapter_RecyclerView_Thumbnail(getActivity());
        rvThumb2.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        Adapter_RecyclerView_Thumbnail list2Solat = new Adapter_RecyclerView_Thumbnail(getActivity());
        listSolat.setListSolat(list);
        list2Solat.setListSolat(list);
        rvThumb1.setAdapter(listSolat);
        rvThumb2.setAdapter(listSolat);
    }
}