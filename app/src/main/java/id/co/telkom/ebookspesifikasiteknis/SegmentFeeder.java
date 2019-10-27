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
import id.co.telkom.ebookspesifikasiteknis.database.DatabaseOpenHelper;
import id.co.telkom.ebookspesifikasiteknis.model.ModelArtikel;

public class SegmentFeeder extends AppCompatActivity implements AdapterSegmentFeeder.OnCallbackListener{

    private AdapterSegmentFeeder adapter;
    private RecyclerView recyclerView;
    private DatabaseOpenHelper db;
    private List<ModelArtikel> feederList = new ArrayList<>();


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

        db = new DatabaseOpenHelper(this);

        feederList.addAll(db.getFeeder());

        adapter = new AdapterSegmentFeeder(feederList, this, this);

        recyclerView = findViewById(R.id.rc_feeder);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(int position) {
        feederList.get(position);
        Intent i = new Intent(this, DetailSegmentFeeder.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MenuUtama.class);
        finishAffinity();
        startActivity(i);
    }
}