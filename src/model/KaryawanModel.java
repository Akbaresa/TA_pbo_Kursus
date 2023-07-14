package model;

import java.util.ArrayList;
import entity.Karyawan;
import interfaces.KaryawanInterface;

public class KaryawanModel implements KaryawanInterface {
    public ArrayList<Karyawan> listKaryawan = new ArrayList<Karyawan>();

    @Override
    public void addKaryawan(Karyawan karyawan) {
        listKaryawan.add(karyawan);
    }

    @Override
    public Karyawan getKaryawan(int index) {
        return listKaryawan.get(index);
    }

    @Override
    public int getListKaryawan() {
        return listKaryawan.size();
    }

    @Override
    public int loginKaryawan(String id, String password) {
        int cekLogin = 0;
        while (cekLogin < getListKaryawan()) {
            if (id.equals(getKaryawan(cekLogin).getId()) &&
                    password.equals(getKaryawan(cekLogin).getPassword())) {
                return cekLogin;
            }
            cekLogin++;
        }
        return -1;
    }
}
