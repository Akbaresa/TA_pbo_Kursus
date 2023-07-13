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

}
