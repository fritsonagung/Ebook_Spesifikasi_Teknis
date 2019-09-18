package id.co.telkom.ebookspesifikasiteknis.ui.OverviewFTTH;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import id.co.telkom.ebookspesifikasiteknis.R;

public class OverviewFTTHFragment extends Fragment {

    private OverviewFTTHViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(OverviewFTTHViewModel.class);
        View root = inflater.inflate(R.layout.fragment_ftth, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        final WebView webView = root.findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/test.html");
        return root;
    }
}