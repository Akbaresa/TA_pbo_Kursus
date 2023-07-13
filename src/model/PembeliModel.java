package model;

import java.util.ArrayList;
import entity.Pembeli;

public class PembeliModel {
    public ArrayList<Pembeli> listPembeli = new ArrayList<Pembeli>();

    public void addPembeli(Pembeli pembeli) {
        listPembeli.add(pembeli);
    }

    public Pembeli getPembeli(int index) {
        return listPembeli.get(index);
    }

    public int getListPembeli() {
        return listPembeli.size();
    }

    public int loginMember(String nama, String password) {
        int cekLogin = 0;
        while (cekLogin < getListPembeli()) {
            if (nama.equals(getPembeli(cekLogin).getNama()) &&
                    password.equals(getPembeli(cekLogin).getPassword())) {
                return cekLogin;
            }
            cekLogin++;
        }
        return -1;
    }
}
