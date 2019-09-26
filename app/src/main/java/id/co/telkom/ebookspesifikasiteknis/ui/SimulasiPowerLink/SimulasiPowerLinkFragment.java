package id.co.telkom.ebookspesifikasiteknis.ui.SimulasiPowerLink;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import id.co.telkom.ebookspesifikasiteknis.R;

public class SimulasiPowerLinkFragment extends Fragment {

    private SimulasiPoweLinkViewModel simulasiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        simulasiViewModel =
                ViewModelProviders.of(this).get(SimulasiPoweLinkViewModel.class);
        View root = inflater.inflate(R.layout.fragment_simulasi, container, false);

        return root;
    }
}
