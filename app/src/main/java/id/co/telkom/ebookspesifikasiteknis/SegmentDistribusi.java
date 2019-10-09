package id.co.telkom.ebookspesifikasiteknis;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.adapter.AdapterSegmentDistribusi;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDistribusi;
import id.co.telkom.ebookspesifikasiteknis.presenter.PresenterSegmentDistribusi;
import id.co.telkom.ebookspesifikasiteknis.presenter.PresenterSegmentDistribusiImp;
import id.co.telkom.ebookspesifikasiteknis.view.ViewSegmentDistribusi;


public class SegmentDistribusi extends AppCompatActivity implements ViewSegmentDistribusi {

    private List<ModelSegmentDistribusi> segmentDistribusisList = new ArrayList<>();
    private PresenterSegmentDistribusi presenter;
    private AdapterSegmentDistribusi adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segment_distribusi);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Segment Distribusi");


        // Tambah panah kembali
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        presenter = new PresenterSegmentDistribusiImp(this);

        recyclerView = findViewById(R.id.rc_distribusi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AdapterSegmentDistribusi(segmentDistribusisList);
        recyclerView.setAdapter(adapter);


        presenter.load();

    }

    @Override
    public void onLoad(List<ModelSegmentDistribusi> segmentDistribusis) {
        segmentDistribusisList.clear();
        segmentDistribusisList.addAll(segmentDistribusis);
    }
}