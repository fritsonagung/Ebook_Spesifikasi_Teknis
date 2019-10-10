package id.co.telkom.ebookspesifikasiteknis.presenter;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentFeeder;
import id.co.telkom.ebookspesifikasiteknis.view.ViewSegmentFeeder;

public class PresenterSegmentFeederImp implements PresenterSegmentFeeder {

    private ViewSegmentFeeder viewSegmentFeeder;
    private List<ModelSegmentFeeder> segmentFeeders = new ArrayList<>();

    public PresenterSegmentFeederImp(ViewSegmentFeeder viewSegmentFeeder){
        this.viewSegmentFeeder = viewSegmentFeeder;
        setData();
    }

    private void setData() {
        ModelSegmentFeeder segmentFeeder = new ModelSegmentFeeder();
        segmentFeeder.setId(1);
        segmentFeeder.setJudul_segment_feeder("FTM (ODF + FMS)");
        segmentFeeder.setMateri_segment_feeder("FTM adalah perangkat yang berfungsi untuk mengelola terminasi dan" +
                " koneksi kabel fiber optik antar perangkat aktif baik perangkat transmisi maupun" +
                " akses, sebagai titik terminasi dari kabel fiber optik OSP dan sebagai titik" +
                " koneksi antara perangkat aktif.\n\n Komponen utama dari FTM terdiri dari Rack, " +
                "Optical Distribution Frame (ODF) / Fiber Termination Box (FTB) sebagai terminasi " +
                "kabel optik yang dilengkapi dengan fiber duct atau fiber guide, untuk memudahkan" +
                " proses administrasi perkabelan, operasi dan pemeliharaan jaringan kabel optik.\n\n" +
                "Contoh perangkat FTM dapat dilihat pada gambar di bawah.");
        segmentFeeder.setGambar(R.drawable.ftm);
        segmentFeeders.add(segmentFeeder);

        ModelSegmentFeeder segmentFeeder1 = new ModelSegmentFeeder();
        segmentFeeder1.setId(2);
        segmentFeeder1.setJudul_segment_feeder("ODF FMS");
        segmentFeeder1.setMateri_segment_feeder("Optical Distribution Frame dan Fiber Management System Adalah " +
                "bagian daripada FTM, yaitu perangkat yang berupa suatu frame tertutup dengan " +
                "struktur mekanik berupa rack atau shelf atau struktur lain yang mempunyai fungsi " +
                "utama sebagai tempat pegangan kabel(fiber) dan passive spliter (elemen pasif lainnya), " +
                "dilengkapi fiber organizer serta mampu melindungi elemen-elemen didalamnya yang " +
                "digunakan untuk tempat terminasi kabel serat optik yang berasal dari OSP dan " +
                "perangkat aktif.\n\n" +
                "Contoh perangkat ODF FMS dapat dilihat pada gambar di bawah.");
        segmentFeeder1.setGambar(R.drawable.odf_fms);
        segmentFeeders.add(segmentFeeder1);

        ModelSegmentFeeder segmentFeeder2 = new ModelSegmentFeeder();
        segmentFeeder2.setId(3);
        segmentFeeder2.setJudul_segment_feeder("Feeder Fiber Optik");
        segmentFeeder2.setMateri_segment_feeder("Feeder Fiber Optik mempunyai fungsi untuk menyalurkan informasi " +
                "yang berupa sinyal optik hasil konversi perangkat opto-elektik ( OLT ), biasanya " +
                "menggunakan kabel serat optik Single Mode tipe G652D Loose tube dan jenis kabel " +
                "yang digunakan sesuai dengan instalasinya, ditinjau dari jenis instalasinya maka " +
                "jenis kabel feeder terdiri dari beberapa macam yaitu sebahai berikut:\n" +
                "\n" +
                "1. Kabel serat optik tanam langsung( jarang di implementasikan )\n" +
                "\n" +
                "2. Kabel serat optik duct, jenis ini ada 2macam yaitu :\n" +
                "\n" +
                "- Dengan sistem duct konvensional (instalasinya dengan cara penarikan ).dengan " +
                "pelindung Duct dan pipa HDPE (merefer STEL K-015-2008 )\n\n" +
                "- Dengan sistem Micro duct dimana cara instalasinya dengan dorongan tekanan udara" +
                " ( Air Blown System ). Di indonesia belum digunakan sebagai Feeder FO →baru untuk" +
                " Ring Inner City\n\n" +
                "3. Kabel serat optik udara ( aerial ), jenis ini juga ada 2 macam :\n\n" +
                "- Dengan sistim konvensional (instalasinya dengan cara penarikan ).Dengan " +
                "penggantung (merefer STEL K-017-2009 Versi : 2.1 )\n\n" +
                "- Dengan sistem Micro duct dimana carainstalasinya dengan dorongan tekananudara " +
                "( Air Blown System ). Di indonesia belum digunakan sebagai Feeder FO.\n\n" +
                "Contoh perangkat kabel feeder dapat dilihat pada gambar di bawah.");
        segmentFeeder2.setGambar(R.drawable.kabel_feeder);
        segmentFeeders.add(segmentFeeder2);

        ModelSegmentFeeder segmentFeeder3 = new ModelSegmentFeeder();
        segmentFeeder3.setId(4);
        segmentFeeder3.setJudul_segment_feeder("Sarana Sambung Kabel Fiber Optik");
        segmentFeeder3.setMateri_segment_feeder("Sarana Sambung Kabel FO Keperluan kabel untuk dinstalasi di lapangan " +
                "beraneka ragam, sedangkan panjang kabel yang ada dalam 1 haspel terbatas berkisar " +
                "antara 3 Km ( kap ≤ 96 core) dan 2 Km ( kap 144 & 264 core ).\n" +
                "\n" +
                "Jika diperlukan instalasi kabel yang diperlukan lebih dari 3 Km maka diperlukan " +
                "perangkat untuk menyambungkan pelindung dari sambungan tersebut, hal tersebut " +
                "dimaksudkan untuk menjaga kualitas dari pada kabel, alat sambung yang digunakan " +
                "bisanya universal closure spesifikasi merefer STEL L-037-2001 Ver.2\n" +
                "\n" +
                "Ukuran sarana sambung kabel tipe closure yang ada di pabrikan sebagai berikut :\n\n" +
                "1. Sampai dengan 64 core\n" +
                "2. Sampai dengan 96 core.\n" +
                "3. Sampai dengan 144 core.\n" +
                "4. Sampai dengan 264 core.");
        segmentFeeders.add(segmentFeeder3);

        ModelSegmentFeeder segmentFeeder4 = new ModelSegmentFeeder();
        segmentFeeder4.setId(5);
        segmentFeeder4.setJudul_segment_feeder("ODC ( Optical Distribution Cabinet)");
        segmentFeeder4.setMateri_segment_feeder("Optical Distribution Cabinet adalah suatu perangkat pasif yang di" +
                " instalasi diluar STO bisa dilapangan ( Outdoor ) dan juga bisa di dalam ruangan " +
                "/ di MDF Gedung HRB( Indoor ), yang mempunyai fungsi sebagai berikut :\n\n" +
                "1. Sebagai titik terminasi ujung kabel feeder dan pangkal kabel distribusi\n\n" +
                "2. Sebagai titik distribusi kabel darikapasitas besar ( feeder ) menjadi beberapa " +
                "kabel yang kapasitasnyalebih kecil lagi ( distribusi ) untuk flesibilitas\n\n" +
                "3. Tempat Spliter\n\n" +
                "4. Tempat penyambungan\n\n" +
                "Contoh perangkat ODC dapat dilihat pada gambar dibawah.");
        segmentFeeder4.setGambar(R.drawable.odc);
        segmentFeeders.add(segmentFeeder4);

        ModelSegmentFeeder segmentFeeder5 = new ModelSegmentFeeder();
        segmentFeeder5.setId(6);
        segmentFeeder5.setJudul_segment_feeder("Splitter");
        segmentFeeder5.setMateri_segment_feeder("Splitter adalah suatu perangkat pasif yang berfungsi untuk membagi" +
                "informasi sinyal optik ( gelombang cahaya ), kapasitas distribusi dari spliter" +
                "bermacam- macam yaitu 1:2, 1:4, 1:8,1:16,1:32, dan 1:64, spesifikasi teknis " +
                "merefer (STEL-L -047- 2008 Ver1).\n\n Ada juga yang inputnya 2 seperti 2:16 dan 2:32" +
                "Direkomendasikan digunakan di Telkom sampai 1:32 secara total ( System) Aplikasinya :\n\n" +
                "1. One stage : 1:32\n" +
                "2. Two Stage : 1:2 dan 1:16 atau 1:4 dan 1:8, sehingga yang dipasang di ODC hanya" +
                " 1:2 dan 1:4 saja.\n\n" +
                "Contoh perangkat splitter dapat dilihat pada gambar dibawah.");
        segmentFeeder5.setGambar(R.drawable.splitter);
        segmentFeeders.add(segmentFeeder5);
    }

    @Override
    public void load() {
        viewSegmentFeeder.onLoad(segmentFeeders);
    }

}
