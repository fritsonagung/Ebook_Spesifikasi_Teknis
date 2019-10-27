package id.co.telkom.ebookspesifikasiteknis;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailDrop extends AppCompatActivity {

    private TextView judul, isi;
    private ImageView gambar;
    private String uri_gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_drop);

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


        judul = findViewById(R.id.txt_judul);
        isi = findViewById(R.id.txt_isi);
        gambar = findViewById(R.id.img_gambar);

        Intent i = getIntent();

        judul.setText(i.getStringExtra("judul_artikel"));
        isi.setText(i.getStringExtra("isi_artikel"));

        uri_gambar = i.getStringExtra("gambar_artikel");
        Glide.with(this).load(uri_gambar).into(gambar);

    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(this, SegmentDrop.class);
        finishAffinity();
        finish();
        startActivity(i);
    }
}
