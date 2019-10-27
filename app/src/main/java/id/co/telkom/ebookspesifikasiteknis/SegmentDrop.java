package id.co.telkom.ebookspesifikasiteknis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.adapter.AdapterDrop;
import id.co.telkom.ebookspesifikasiteknis.database.DatabaseOpenHelper;
import id.co.telkom.ebookspesifikasiteknis.model.ModelArtikel;

public class SegmentDrop extends AppCompatActivity implements AdapterDrop.OnCallbackListener{

    private AdapterDrop adapter;
    private RecyclerView recyclerView;
    private DatabaseOpenHelper db;
    private List<ModelArtikel> dropList = new ArrayList<>();


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

        db = new DatabaseOpenHelper(this);

        dropList.addAll(db.getDrop());

        adapter = new AdapterDrop(dropList, this, this);

        recyclerView = findViewById(R.id.rc_drop);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    @Override
    public void onClick(int position) {
        dropList.get(position);
        Intent i = new Intent(this, DetailDrop.class);
        startActivity(i);
    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, MenuUtama.class);
        finishAffinity();
        startActivity(i);
    }
}