package id.co.telkom.ebookspesifikasiteknis.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ModelSegmentFeeder implements Parcelable {

    private int id;
    private String judul_segment_feeder;
    private String materi_segment_feeder;
    private int gambar;

    public ModelSegmentFeeder(Parcel in) {
        id = in.readInt();
        judul_segment_feeder = in.readString();
        materi_segment_feeder = in.readString();
        gambar = in.readInt();
    }

    public static final Creator<ModelSegmentFeeder> CREATOR = new Creator<ModelSegmentFeeder>() {
        @Override
        public ModelSegmentFeeder createFromParcel(Parcel in) {
            return new ModelSegmentFeeder(in);
        }

        @Override
        public ModelSegmentFeeder[] newArray(int size) {
            return new ModelSegmentFeeder[size];
        }
    };

    public ModelSegmentFeeder() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJudul_segment_feeder() {
        return judul_segment_feeder;
    }

    public void setJudul_segment_feeder(String judul_segment_feeder) {
        this.judul_segment_feeder = judul_segment_feeder;
    }

    public String getMateri_segment_feeder() {
        return materi_segment_feeder;
    }

    public void setMateri_segment_feeder(String materi_segment_feeder) {
        this.materi_segment_feeder = materi_segment_feeder;
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
        dest.writeString(judul_segment_feeder);
        dest.writeString(materi_segment_feeder);
        dest.writeInt(gambar);
    }
}
