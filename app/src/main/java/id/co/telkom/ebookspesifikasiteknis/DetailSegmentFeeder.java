package id.co.telkom.ebookspesifikasiteknis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentFeeder;

public class DetailSegmentFeeder extends AppCompatActivity {

    private TextView judul, materi;
    private ImageView gambar;
    private int image_res;
    private String judul_feeder,materi_feeder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_segment_feeder);

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

        Intent i = getIntent();
        ModelSegmentFeeder segmentFeeder = i.getParcelableExtra("Segment Feeder Item");

        judul_feeder = segmentFeeder.getJudul_segment_feeder();
        materi_feeder = segmentFeeder.getMateri_segment_feeder();
        image_res = segmentFeeder.getGambar();

        judul = findViewById(R.id.txt_judul);
        judul.setText(judul_feeder);

        materi = findViewById(R.id.txt_materi);
        materi.setText(materi_feeder);

        gambar = findViewById(R.id.img_gambar);
        gambar.setImageResource(image_res);

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, SegmentFeeder.class);
        finishAffinity();
        finish();
        startActivity(i);
    }
}
