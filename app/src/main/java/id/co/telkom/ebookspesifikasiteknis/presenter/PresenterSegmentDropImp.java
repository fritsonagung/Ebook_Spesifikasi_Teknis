package id.co.telkom.ebookspesifikasiteknis.presenter;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDrop;
import id.co.telkom.ebookspesifikasiteknis.view.ViewSegmentDrop;


public class PresenterSegmentDropImp implements PresenterSegmentDrop {
    private ViewSegmentDrop viewSegmentDrop;
    private List<ModelSegmentDrop> segmentDrops = new ArrayList<>();

    public PresenterSegmentDropImp(ViewSegmentDrop viewSegmentDrop) {
        this.viewSegmentDrop = viewSegmentDrop;
        setData();
    }

    private void setData() {
        ModelSegmentDrop segmentDrop = new ModelSegmentDrop();
        segmentDrop.setId(1);
        segmentDrop.setJudul_segment_drop("Kabel Drop");
        segmentDrop.setMateri_segment_drop("Kabel Drop berfungsi menerus kansinyal optic dari ODP " +
                "ke rumah–rumah pelanggan, tipe kabel drop yang digunakan adalah tipe G 657 hal ini" +
                " dimaksudkan untuk menanggulangi lokasi instalasinya yang banyak belokan– belokan " +
                "sehingga harus menggunakan optik yang bending insensitive, kapasitas kabel drop " +
                "pada umumnya 1, 2, dan 4 core.\n\n Untuk letak lokasi instalasinya kabel drop ada 3 " +
                "macam yaitu:\n\n" +
                "1. Kabel drop untuk instalasi dengan pelindung pipa HH/ Pit ( sesuai STEL K-034-2010 Versi : 1.0 )\n" +
                "\n" +
                "2. Kabel Drop ABF ( Air Blown Fiber ) dengan Micro Duct.\n" +
                "\n" +
                "3. Kabel drop dengan penggantung ( aerial ) sesuai STEL K-033-2009 Versi :1.0\n\n" +
                "Contoh perangkat kabel drop dapat dilihat pada gambar di bawah.");
        segmentDrop.setGambar(R.drawable.kabel_drop);
        segmentDrops.add(segmentDrop);

        ModelSegmentDrop segmentDrop1 = new ModelSegmentDrop();
        segmentDrop1.setId(2);
        segmentDrop1.setJudul_segment_drop("OTP ( Optical Terminal Premises )");
        segmentDrop1.setMateri_segment_drop("OTP juga merupakan perangkat pasif yang dipasang " +
                "di rumah pelanggan, yang mempunyai fungsi sebagai berikut :\n\n" +
                "1. Titik terminasi atau titik tambat akhir dari kabel drop\n" +
                "\n" +
                "2. Tempat sambungan core optik / peralihan dari kabel outdoor dengan Indoor\n" +
                "Kapasitas OTP biasanya 1, 2 dan 4 port.\n\n" +
                "Contoh perangkat OTP dapat dilihat pada gambar di bawah.");
        segmentDrop1.setGambar(R.drawable.otp);
        segmentDrops.add(segmentDrop1);
    }

    @Override
    public void load() {
        viewSegmentDrop.onLoad(segmentDrops);
    }
}
