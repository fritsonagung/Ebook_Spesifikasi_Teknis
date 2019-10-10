package id.co.telkom.ebookspesifikasiteknis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDrop;


public class DetailSegmentDrop extends AppCompatActivity {

    private TextView judul, materi;
    private ImageView gambar;
    private int image_res;
    private String judul_drop, materi_drop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_segment_drop);

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

        Intent i = getIntent();
        ModelSegmentDrop segmentDrop = i.getParcelableExtra("Segment Drop Item");

        judul_drop = segmentDrop.getJudul_segment_drop();
        materi_drop = segmentDrop.getMateri_segment_drop();
        image_res = segmentDrop.getGambar();

        judul = findViewById(R.id.txt_judul);
        judul.setText(judul_drop);

        materi = findViewById(R.id.txt_materi);
        materi.setText(materi_drop);

        gambar = findViewById(R.id.img_gambar);
        gambar.setImageResource(image_res);

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, SegmentDrop.class);
        finishAffinity();
        finish();
        startActivity(i);
    }
}
