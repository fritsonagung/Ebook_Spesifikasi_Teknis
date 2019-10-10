package id.co.telkom.ebookspesifikasiteknis.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelSegmentDistribusi implements Parcelable {
    private int id;
    private String judul_segment_distribusi;
    private String materi_segment_distribusi;
    private int gambar;

    public ModelSegmentDistribusi(Parcel in) {
        id = in.readInt();
        judul_segment_distribusi = in.readString();
        materi_segment_distribusi = in.readString();
        gambar = in.readInt();
    }

    public static final Creator<ModelSegmentDistribusi> CREATOR = new Creator<ModelSegmentDistribusi>() {
        @Override
        public ModelSegmentDistribusi createFromParcel(Parcel in) {
            return new ModelSegmentDistribusi(in);
        }

        @Override
        public ModelSegmentDistribusi[] newArray(int size) {
            return new ModelSegmentDistribusi[size];
        }
    };

    public ModelSegmentDistribusi() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul_segment_distribusi() {
        return judul_segment_distribusi;
    }

    public void setJudul_segment_distribusi(String judul_segment_distribusi) {
        this.judul_segment_distribusi = judul_segment_distribusi;
    }

    public String getMateri_segment_distribusi() {
        return materi_segment_distribusi;
    }

    public void setMateri_segment_distribusi(String materi_segment_distribusi) {
        this.materi_segment_distribusi = materi_segment_distribusi;
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
        dest.writeString(judul_segment_distribusi);
        dest.writeString(materi_segment_distribusi);
        dest.writeInt(gambar);
    }
}
