package id.co.telkom.ebookspesifikasiteknis.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.model.ModelArtikel;

public class DatabaseOpenHelper extends SQLiteAssetHelper {

    // Database Info
    private static final String DATABASE_NAME = "SpesifikasiTeknis.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }


    // ambil artikel feeder
    public List<ModelArtikel> getFeeder() {
        String query;
        query = "SELECT id_artikel, judul_artikel, isi_artikel, gambar_artikel, id_tipe_artikel" +
                " FROM tabel_artikel WHERE id_tipe_artikel = 2";

        List<ModelArtikel> feederList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(query, null);
        ModelArtikel modelArtikel;

        if (cursor.moveToFirst()) {
            do {
                modelArtikel = new ModelArtikel();

                modelArtikel.setId_artikel(cursor.getInt(cursor.getColumnIndex("id_artikel")));
                modelArtikel.setJudul_artikel(cursor.getString(cursor.getColumnIndex("judul_artikel")));
                modelArtikel.setIsi_artikel(cursor.getString(cursor.getColumnIndex("isi_artikel")));
                modelArtikel.setGambar_artikel(cursor.getString(cursor.getColumnIndex("gambar_artikel")));
                modelArtikel.setId_tipe_artikel(cursor.getInt(cursor.getColumnIndex("id_tipe_artikel")));

                feederList.add(modelArtikel);

            } while (cursor.moveToNext());
        }

        return feederList;
    }
}