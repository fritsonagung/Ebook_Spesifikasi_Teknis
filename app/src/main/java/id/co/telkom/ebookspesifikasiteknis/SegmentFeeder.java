package id.co.telkom.ebookspesifikasiteknis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.adapter.AdapterSegmentFeeder;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentFeeder;
import id.co.telkom.ebookspesifikasiteknis.presenter.PresenterSegmentFeeder;
import id.co.telkom.ebookspesifikasiteknis.presenter.PresenterSegmentFeederImp;
import id.co.telkom.ebookspesifikasiteknis.view.ViewSegmentFeeder;


public class SegmentFeeder extends AppCompatActivity implements ViewSegmentFeeder,
        AdapterSegmentFeeder.OnCallbackListener {

    private List<ModelSegmentFeeder> segmentFeedersList = new ArrayList<>();
    private PresenterSegmentFeeder presenter;
    private AdapterSegmentFeeder adapter;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segment_feeder);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Segment Feeder");


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

        presenter = new PresenterSegmentFeederImp(this);

        recyclerView = findViewById(R.id.rc_feeder);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AdapterSegmentFeeder(this, segmentFeedersList, this);
        recyclerView.setAdapter(adapter);

        presenter.load();
    }

    @Override
    public void onLoad(List<ModelSegmentFeeder> segmentFeeders) {
        segmentFeedersList.clear();
        segmentFeedersList.addAll(segmentFeeders);
    }

    @Override
    public void onClick(int position) {
        segmentFeedersList.get(position);
        Intent i = new Intent(this, DetailSegmentFeeder.class);
        startActivity(i);
    }
}