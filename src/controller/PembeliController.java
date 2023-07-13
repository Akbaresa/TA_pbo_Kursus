package controller;

import entity.Pembeli;

public class PembeliController {
    public void insertPembeli() {
        String nama[] = {
                "febi", "caca", "gerrad"
        };
        String password[] = {
                "12", "12", "12"
        };
        Double uang[] = {
                100000.00, 230000.00, 10000.00
        };

        for (int i = 0; i < uang.length; i++) {
            AllModelObject.pembeli.addPembeli(new Pembeli(nama[i], password[i], uang[i]));
        }
    }

    public Pembeli getPembeli(int index) {
        insertPembeli();
        return AllModelObject.pembeli.getPembeli(index);
    }
}
