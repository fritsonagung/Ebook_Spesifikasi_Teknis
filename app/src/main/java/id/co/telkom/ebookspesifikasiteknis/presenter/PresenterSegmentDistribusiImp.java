package id.co.telkom.ebookspesifikasiteknis.presenter;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelSegmentDistribusi;
import id.co.telkom.ebookspesifikasiteknis.view.ViewSegmentDistribusi;

public class PresenterSegmentDistribusiImp implements PresenterSegmentDistribusi{
    private ViewSegmentDistribusi viewSegmentDistribusi;
    private List<ModelSegmentDistribusi> segmentDistribusis = new ArrayList<>();

    public PresenterSegmentDistribusiImp(ViewSegmentDistribusi viewSegmentDistribusi){
        this.viewSegmentDistribusi = viewSegmentDistribusi;
        setData();
    }

    private void setData() {
        ModelSegmentDistribusi segmentDistribusi = new ModelSegmentDistribusi();
        segmentDistribusi.setId(1);
        segmentDistribusi.setJudul_segment_distribusi("Distribusi Fiber Optik");
        segmentDistribusi.setMateri_segment_distribusi("Kabel serat optik distribusi ini sama hal " +
                "seperti kabel serat optik feeder yang mempunyai fungsi untuk meneruskan informasi " +
                "yang berupa sinyal optik dari mulai ODC sampai dengan ODP, tetap menggunakan kabel " +
                "fiber optic Single Mode tipe G652D dan jenis instalasinya sama dengan feeder, " +
                "apakah Tanam Langsung, Dalam Polongan Duct, HDPE,Micro Duct dan Aerial.\n" +
                "\n" +
                "Kapasitasnya kabel serat optik untuk distribusi hanya lebih kecil berkisar 6 core" +
                " sampai 48 core tergantung jenis kabel yang digunakan, seperti :\n" +
                "\n" +
                "1.Kabel Duct konvensional dan HDPE mulai dari 12 s/d 24 dengan 6 tube dan 24 s/d " +
                "48 dengan 12 tube ( merefer STEL K-015-2008 )\n" +
                "\n" +
                "2.Kabel dengan Micro duct mulai dari 2s/d 24 core\n" +
                "\n" +
                "3.Kabel udara mulai dari 12 s/d 24 dengan 6 tube dan 24 s/d 48 dengan 12 tube\n" +
                "\n" +
                "4.Kabel Aerial dan Duct dengan pertube 1 core ( 12 core )\n" +
                "\n" +
                "5.Dengan menggunakan type kabel yang sudah diimplementasi di Jepang :\n" +
                "\n" +
                "- Ribbon Slotted SSW ( utk kap 24 core dan bisa sampai 300 core ) Aerial dan Ribbon " +
                "Slotted ( utk kap 24 dan bisa sampai 1.000 core ) untuk Duct\n" +
                "\n" +
                "- C Slotted SSW untuk Aerial (Maks 24 ) dan untuk Duct ( Maks 24).\n" +
                "\n" +
                "- Single Fiber type SSW ( Self Supporting Window ) kapasitas sampai dengan 8 core" +
                " sampai dengan 24 core\n" +
                "Contoh perangkat FTM dapat dilihat pada gambar di bawah.");
        segmentDistribusi.setGambar(R.drawable.kabel_distribusi);
        segmentDistribusis.add(segmentDistribusi);

        ModelSegmentDistribusi segmentDistribusi1 = new ModelSegmentDistribusi();
        segmentDistribusi1.setId(2);
        segmentDistribusi1.setJudul_segment_distribusi("ODP ( Optical Distribution Poin )");
        segmentDistribusi1.setMateri_segment_distribusi("ODP juga merupakan suatu perangkat pasif " +
                "yang diinstalasi diluar STO bisa di lapangan ( Outdoor ) dan juga bisa di dalam " +
                "ruangan ( Indoor )didalam gedung HRB, yang mempunyai fungsi sebagai berikut :\n" +
                "1.Sebagai titik terminasi ujung kabeldistribusi dan titik tambat awal/pangkal " +
                "kabel drop/ penanggal\n" +
                "2.Sebagai titik distribusi kabel distribusimenjadi beberapa saluran penanggal " +
                "(kabel drop)\n" +
                "3.Tempat Spliter\n" +
                "4.Tempat penyambungan\n" +
                "Sehingga ODP ini harus dilengkapi dengan space untuk splicing, space untuk spliter" +
                " dan sistem pentanahan. Kapasitas ODP bermacam–macam sesuai dengan kebutuhan, yang " +
                "ada dipabrikan secara standar yaitu :\n" +
                "a.Kapasitas 8 Port (Untuk Atas tanah/Aerial ,Bawah Tanah dan HRB)\n" +
                "b.Kapasitas 12 Port (Untuk Atas tanah/Aerial, Bawah Tanah dan HRB)\n" +
                "c.Kapasitas 16 Port (Untuk Bawah Tanah dan HRB)\n" +
                "d.Kapasitas 24 Port (Untuk HRB)\n" +
                "e.Kapasitas 48 Port (Untuk HRB)\n" +
                "Ditinjau dari lokasi atau tempat pemasangannya ODP dapat di bagimenjadi 3 jenis, yaitu:\n" +
                "ODP tipe Wall/ On Pole, ODP jenis ini dipasang di dinding atau juga bisa dipasang" +
                " di atas tiang yang tentunya pada instalasi kabel drop atas tanah (aerial ).\n" +
                "\n" +
                "ODP tipe Pedestal, jenis ODP ini diinstalasi diatas permukaan tanah, dan ODP ini " +
                "digunakan untuk instalasi kabel drop bawah tanah dengan pelindung pipa.\n" +
                "\n" +
                "ODP tipe Closure, jenis ODP ini sangat fleksibel bisa dipasang dibawah tanah, " +
                "di atas tiang bahkan bisa juga di pasang diantara dua tiang ( pada kabel " +
                "distribusi aerial ).\n" +
                "Contoh perangkat ODF FMS dapat dilihat pada gambar di bawah.");
        segmentDistribusi1.setGambar(R.drawable.odp);
        segmentDistribusis.add(segmentDistribusi1);

        ModelSegmentDistribusi segmentDistribusi2 = new ModelSegmentDistribusi();
        segmentDistribusi2.setId(4);
        segmentDistribusi2.setJudul_segment_distribusi("Splitter");
        segmentDistribusi2.setMateri_segment_distribusi("Splitter adalah suatu perangkat pasif yang berfungsi untuk membagi" +
                        "informasi sinyal optik ( gelombang cahaya ). Berbeda dari splitter pada " +
                "segment feeder, splitter yang digunakan pada segment distribusi biasanya adalah" +
                " spitter 1:8 dan splitter 1:16.\n" +
                "Contoh perangkat splitter pada segment distribusi dapat dilihat pada gambar di bawah.");
        segmentDistribusi2.setGambar(R.drawable.splitter_01);
        segmentDistribusis.add(segmentDistribusi2);

    }

    @Override
    public void load() {
        viewSegmentDistribusi.onLoad(segmentDistribusis);
    }

}
