package id.co.telkom.ebookspesifikasiteknis.Adapter;

import java.util.ArrayList;

import id.co.telkom.ebookspesifikasiteknis.Model.Model_Thumbnail;

public class Adapter_Thumbnail_Item {
    public static String[][] data = new String[][]{
            {"1", "Monitor"}, {"2", "Keyboard"}, {"3", "Motherboard"}, {"4", "Mouse"}, {"5", "Heatsink"}
    };

    public static ArrayList<Model_Thumbnail> getListData() {
        Model_Thumbnail model_thumbnail = null;
        ArrayList<Model_Thumbnail> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            model_thumbnail = new Model_Thumbnail();
            model_thumbnail.setJadwal(data[i][0]);
            model_thumbnail.setWaktu(data[i][1]);
            list.add(model_thumbnail);
        }
        return list;
    }
}

