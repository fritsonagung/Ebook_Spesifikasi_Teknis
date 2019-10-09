package id.co.telkom.ebookspesifikasiteknis;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.adapter.AdapterSegmentDrop;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDrop;
import id.co.telkom.ebookspesifikasiteknis.presenter.PresenterSegmentDrop;
import id.co.telkom.ebookspesifikasiteknis.presenter.PresenterSegmentDropImp;
import id.co.telkom.ebookspesifikasiteknis.view.ViewSegmentDrop;


public class SegmentDrop extends AppCompatActivity implements ViewSegmentDrop {

    private List<ModelSegmentDrop> segmentDropList = new ArrayList<>();
    private PresenterSegmentDrop presenter;
    private AdapterSegmentDrop adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segment_drop);

        androidx.appcompat.widget.Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        setTitle("Segment Drop");


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

        presenter = new PresenterSegmentDropImp(this);

        recyclerView = findViewById(R.id.rc_drop);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new AdapterSegmentDrop(segmentDropList);
        recyclerView.setAdapter(adapter);

        presenter.load();

    }

    @Override
    public void onLoad(List<ModelSegmentDrop> segmentDrops) {
        segmentDropList.clear();
        segmentDropList.addAll(segmentDrops);
    }
}