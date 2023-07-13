package controller;

import java.util.List;

import entity.Barang;

public class BarangController {
    public void insertBarang() {
        String namaBarang[] = {
                "sikat gigi", "sabun", "gelas", "eskrim", "bulpoin", "pensil", "beng beng"
        };
        Double hargaBarang[] = {
                4000.00, 2000.00, 7000.00, 5000.00, 3000.00, 3500.00, 2000.00
        };
        int stokBarang[] = {
                5, 6, 12, 11, 4, 7, 10
        };
        for (int i = 0; i < stokBarang.length; i++) {
            AllModelObject.barang.addBarang(new Barang(namaBarang[i], hargaBarang[i], stokBarang[i]));
        }
    }

    public int getListBarang() {
        return AllModelObject.barang.getListBarang();
    }

    // method get
    public Barang getBarang(int index) {
        insertBarang();
        return AllModelObject.barang.getBarang(index);
    }

    public String getNamaBarang(int index) {
        return AllModelObject.barang.getNamaBarang(index);
    }

    public Double getHargaBarang(int index) {
        return AllModelObject.barang.getHargaBarang(index);
    }

    public int getStokBarang(int index) {
        return AllModelObject.barang.getStokBarang(index);
    }
    // end method get

    // method set
    public void setNamaBarang(int index, String namaBarang) {
        AllModelObject.barang.setNamaBarang(index, namaBarang);
    }

    public void setStokBarang(int index, int stokBarang) {
        AllModelObject.barang.setStokBarang(index, stokBarang);
    }

    public void setHargaBarang(int index, Double hargaBarang) {
        AllModelObject.barang.setHargaBarang(index, hargaBarang);
    }
    // end method set

    // delete
    public void removebarang(int index) {
        AllModelObject.barang.removeBarang(index);
    }

}
