package id.co.telkom.ebookspesifikasiteknis.presenter;

import java.util.ArrayList;
import java.util.List;

import id.co.telkom.ebookspesifikasiteknis.R;
import id.co.telkom.ebookspesifikasiteknis.model.ModelOverviewFTTH;
import id.co.telkom.ebookspesifikasiteknis.view.ViewOverviewFTTH;

public class PresenterOverviewFTTHImp implements PresenterOverviewFTTH {
    private ViewOverviewFTTH viewOverviewFTTH;
    private List<ModelOverviewFTTH> overviewFTTHS = new ArrayList<>();

    public PresenterOverviewFTTHImp(ViewOverviewFTTH viewOverviewFTTH) {
        this.viewOverviewFTTH = viewOverviewFTTH;
        setData();
    }

    private void setData() {
        ModelOverviewFTTH overviewFTTH = new ModelOverviewFTTH();
        overviewFTTH.setId(1);
        overviewFTTH.setJudul_overview_ftth("Fiber To The Home (FTTH)");
        overviewFTTH.setMateri_overview_ftth("Fiber To The Home (disingkat FTTH) merupakan suatu " +
                "format penghantaran isyarat optik dari pusat penyedia (provider) ke kawasan " +
                "pengguna dengan menggunakan serat optik sebagai medium ponghantaran.\n\n " +
                "Perkembangan teknologi ini tidak terlepas dari kemajuan perkembangan " +
                "teknologi serat optik yang dapat menggantikan penggunaan kabel konvensional, " +
                "dan juga didorong oleh keinginan untuk mendapatkan layanan yang dikenal dengan " +
                "istilah Triple Play Services yaitu layanan akan akses internet yang cepat, suara " +
                "(jaringan telepon, PTSN) dan video (TV kabel) dalam satu infrastruktur pada unit" +
                " pelanggan.\n" +
                "\n" +
                "Penghantaran dengan menggunakan teknologi FTTH ini dapat menghemat biaya dan " +
                "mampu mengurangkan biaya operasi dan memberikan pelayanan yang lebih baik kepada " +
                "pelanggan. Ciri-ciri inheren serat optik membenarkan penghantaran isyarat" +
                " telekomunikasi dengan jalur lebar dan lebih besar dibandingkan penggunaan" +
                " kabel konvensional\n\n" +
                "Secara umum jaringan FTTH/B dapt dibagi menjadi 4 Segmen catuan kabel selain " +
                "perangkap Aktif seperti OLT dan ONU/ONT, yaitu sbb:\n\n" +
                "1. Segmen A: Catuan kabel Feeder\n\n" +
                "2. Segmen B: Catuan kabel Distribusi\n\n" +
                "3. Segmen C: Catuan kabel Penanggal / Drop\n\n" +
                "4. Segmen D: Catuan kabel Rumah / Gedung\n\n" +
                "Untuk gambar network dan elemen jaringan ftth dapat dilihat pada gambar di bawah.");
        overviewFTTH.setGambar(R.drawable.elemen_ftth);
        overviewFTTHS.add(overviewFTTH);
    }

    @Override
    public void load() {
        viewOverviewFTTH.onLoad(overviewFTTHS);
    }
}
