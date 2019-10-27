package id.co.telkom.ebookspesifikasiteknis.model;

public class ModelKalkulator {
    private int id_perhitungan;
    private int redaman_kabel;
    private int redaman_sambungan;
    private int redaman_konektor;
    private int hasil_rx;

    public int getId_perhitungan() {
        return id_perhitungan;
    }

    public void setId_perhitungan(int id_perhitungan) {
        this.id_perhitungan = id_perhitungan;
    }

    public int getRedaman_kabel() {
        return redaman_kabel;
    }

    public void setRedaman_kabel(int redaman_kabel) {
        this.redaman_kabel = redaman_kabel;
    }

    public int getRedaman_sambungan() {
        return redaman_sambungan;
    }

    public void setRedaman_sambungan(int redaman_sambungan) {
        this.redaman_sambungan = redaman_sambungan;
    }

    public int getRedaman_konektor() {
        return redaman_konektor;
    }

    public void setRedaman_konektor(int redaman_konektor) {
        this.redaman_konektor = redaman_konektor;
    }

    public int getHasil_rx() {
        return hasil_rx;
    }

    public void setHasil_rx(int hasil_rx) {
        this.hasil_rx = hasil_rx;
    }
}
