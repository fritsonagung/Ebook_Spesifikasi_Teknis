package id.co.telkom.ebookspesifikasiteknis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDistribusi;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentFeeder;

public class DetailSegmentDistribusi extends AppCompatActivity {

    private TextView judul, materi;
    private ImageView gambar;
    private int image_res;
    private String judul_distribusi,materi_distribusi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_segment_distribusi);

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

        Intent i = getIntent();
        ModelSegmentDistribusi segmentDistribusi = i.getParcelableExtra("Segment Distribusi Item");

        judul_distribusi = segmentDistribusi.getJudul_segment_distribusi();
        materi_distribusi = segmentDistribusi.getMateri_segment_distribusi();
        image_res = segmentDistribusi.getGambar();

        judul = findViewById(R.id.txt_judul);
        judul.setText(judul_distribusi);

        materi = findViewById(R.id.txt_materi);
        materi.setText(materi_distribusi);

        gambar = findViewById(R.id.img_gambar);
        gambar.setImageResource(image_res);

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, SegmentDistribusi.class);
        finishAffinity();
        finish();
        startActivity(i);
    }
}
