package id.co.telkom.ebookspesifikasiteknis.model;

public class ModelArtikel {

    private int id_artikel;
    private int id_tipe_artikel;
    private String gambar_artikel;
    private String judul_artikel;
    private String isi_artikel;


    public ModelArtikel(){

    }

    public ModelArtikel (int id_artikel, String judul_artikel, String isi_artikel, String gambar_artikel, int id_tipe_artikel) {
        this.id_artikel = id_artikel;
        this.judul_artikel = judul_artikel;
        this.isi_artikel = isi_artikel;
        this.gambar_artikel = gambar_artikel;
        this.id_tipe_artikel = id_tipe_artikel;
    }


    public int getId_artikel() {
        return id_artikel;
    }

    public void setId_artikel(int id_artikel) {
        this.id_artikel = id_artikel;
    }

    public int getId_tipe_artikel() {
        return id_tipe_artikel;
    }

    public void setId_tipe_artikel(int id_tipe_artikel) {
        this.id_tipe_artikel = id_tipe_artikel;
    }

    public String getGambar_artikel() {
        return gambar_artikel;
    }

    public void setGambar_artikel(String gambar_artikel) {
        this.gambar_artikel = gambar_artikel;
    }

    public String getJudul_artikel() {
        return judul_artikel;
    }

    public void setJudul_artikel(String judul_artikel) {
        this.judul_artikel = judul_artikel;
    }

    public String getIsi_artikel() {
        return isi_artikel;
    }

    public void setIsi_artikel(String isi_artikel) {
        this.isi_artikel = isi_artikel;
    }
}

