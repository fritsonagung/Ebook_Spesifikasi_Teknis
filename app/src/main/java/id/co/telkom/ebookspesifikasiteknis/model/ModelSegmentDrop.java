package id.co.telkom.ebookspesifikasiteknis.model;

public class ModelSegmentDrop {

    private int id;
    private String judul_segment_drop;
    private String materi_segment_drop;
    private int gambar;

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
}
