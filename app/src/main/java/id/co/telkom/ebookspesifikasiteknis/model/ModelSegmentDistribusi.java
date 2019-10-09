package id.co.telkom.ebookspesifikasiteknis.model;

public class ModelSegmentDistribusi {
    private int id;
    private String judul_segment_distribusi;
    private String materi_segment_distribusi;
    private int gambar;

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
}
