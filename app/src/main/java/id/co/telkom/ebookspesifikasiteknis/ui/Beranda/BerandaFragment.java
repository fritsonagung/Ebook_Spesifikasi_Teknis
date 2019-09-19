package id.co.telkom.ebookspesifikasiteknis.ui.Beranda;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

import id.co.telkom.ebookspesifikasiteknis.Adapter.Adapter_Thumbnail_Item;
import id.co.telkom.ebookspesifikasiteknis.Model.Model_Thumbnail;
import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.ui.OverviewFTTH.OverviewFTTHFragment;
import id.co.telkom.ebookspesifikasiteknis.ui.SegementFeeder.SegmentFeederFragment;
import id.co.telkom.ebookspesifikasiteknis.ui.SegmentDistribusi.SegmentDistribusiFragment;
import id.co.telkom.ebookspesifikasiteknis.ui.SegmentDrop.SegmentDropFragment;
import id.co.telkom.ebookspesifikasiteknis.ui.SimulasiPowerLink.SimulasiPowerLinkFragment;

public class BerandaFragment extends Fragment {

    private LinearLayout ftth,feeder,distribusi,drop,simulasi;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_beranda, container, false);

        ftth = root.findViewById(R.id.button_overview_ftth);
        ftth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OverviewFTTHFragment overviewFTTHFragment = new OverviewFTTHFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), overviewFTTHFragment, "findThisFragment")
                        .addToBackStack(null)
                        .commit();
            }
        });

        feeder = root.findViewById(R.id.button_segment_feeder);
        feeder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SegmentFeederFragment segmentFeederFragment = new SegmentFeederFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), segmentFeederFragment, "findThisFragment2")
                        .addToBackStack(null)
                        .commit();
            }
        });

        distribusi = root.findViewById(R.id.button_segment_distribusi);
        distribusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SegmentDistribusiFragment segmentDistribusiFragment = new SegmentDistribusiFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), segmentDistribusiFragment, "findThisFragment3")
                        .addToBackStack(null)
                        .commit();
            }
        });

        drop = root.findViewById(R.id.button_segment_drop);
        drop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               SegmentDropFragment segmentDropFragment = new SegmentDropFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), segmentDropFragment, "findThisFragment4")
                        .addToBackStack(null)
                        .commit();
            }
        });

        simulasi = root.findViewById(R.id.button_sim_power_link);
        simulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimulasiPowerLinkFragment simulasiPowerLinkFragment = new SimulasiPowerLinkFragment();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(((ViewGroup)getView().getParent()).getId(), simulasiPowerLinkFragment, "findThisFragment5")
                        .addToBackStack(null)
                        .commit();
            }
        });

        return root;
    }
}