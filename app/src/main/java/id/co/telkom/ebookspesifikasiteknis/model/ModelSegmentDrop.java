package id.co.telkom.ebookspesifikasiteknis.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelSegmentDrop implements Parcelable {

    private int id;
    private String judul_segment_drop;
    private String materi_segment_drop;
    private int gambar;

    public ModelSegmentDrop(Parcel in) {
        id = in.readInt();
        judul_segment_drop = in.readString();
        materi_segment_drop = in.readString();
        gambar = in.readInt();
    }

    public static final Creator<ModelSegmentDrop> CREATOR = new Creator<ModelSegmentDrop>() {
        @Override
        public ModelSegmentDrop createFromParcel(Parcel in) {
            return new ModelSegmentDrop(in);
        }

        @Override
        public ModelSegmentDrop[] newArray(int size) {
            return new ModelSegmentDrop[size];
        }
    };

    public ModelSegmentDrop() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul_segment_drop() {
        return judul_segment_drop;
    }

    public void setJudul_segment_drop(String judul_segment_drop) {
        this.judul_segment_drop = judul_segment_drop;
    }

    public String getMateri_segment_drop() {
        return materi_segment_drop;
    }

    public void setMateri_segment_drop(String materi_segment_drop) {
        this.materi_segment_drop = materi_segment_drop;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(judul_segment_drop);
        dest.writeString(materi_segment_drop);
        dest.writeInt(gambar);
    }
}
