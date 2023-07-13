package model;

import java.util.ArrayList;
import entity.Karyawan;

public class KaryawanModel {
    public ArrayList<Karyawan> listKaryawan = new ArrayList<Karyawan>();

    public void addKaryawan(Karyawan karyawan) {
        listKaryawan.add(karyawan);
    }

    public Karyawan getKaryawan(int index) {
        return listKaryawan.get(index);
    }

    public int loginKaryawan() {
        int cek = 0;

        return cek;
    }
}
