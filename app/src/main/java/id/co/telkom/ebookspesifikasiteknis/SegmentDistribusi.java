package id.co.telkom.ebookspesifikasiteknis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.adapter.AdapterDistribusi;
import id.co.telkom.ebookspesifikasiteknis.database.DatabaseOpenHelper;
import id.co.telkom.ebookspesifikasiteknis.model.ModelArtikel;

public class SegmentDistribusi extends AppCompatActivity implements AdapterDistribusi.OnCallbackListener{

    private AdapterDistribusi adapter;
    private RecyclerView recyclerView;
    private DatabaseOpenHelper db;
    private List<ModelArtikel> distribusiList = new ArrayList<>();


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

        db = new DatabaseOpenHelper(this);

        distribusiList.addAll(db.getDistribusi());

        adapter = new AdapterDistribusi(distribusiList, this, this);

        recyclerView = findViewById(R.id.rc_distribusi);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(int position) {
        distribusiList.get(position);
        Intent i = new Intent(this, DetailDistribusi.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MenuUtama.class);
        finishAffinity();
        startActivity(i);
    }
}