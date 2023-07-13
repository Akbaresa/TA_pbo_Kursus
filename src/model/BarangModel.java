package model;

import java.util.ArrayList;
import entity.Barang;

public class BarangModel {
    public ArrayList<Barang> listBarang = new ArrayList<Barang>();

    public void addBarang(Barang barang) {
        listBarang.add(barang);
    }

    public String getNamaBarang(int index) {
        if (index >= 0 && index < listBarang.size()) {
            Barang barang = listBarang.get(index);
            return barang.getNama();
        }
        return null;
    }

    public Double getHargaBarang(int index) {
        if (index >= 0 && index < listBarang.size()) {
            Barang barang = listBarang.get(index);
            return barang.getHarga();
        }
        return null;
    }

    public int getStokBarang(int index) {
        if (index >= 0 && index < listBarang.size()) {
            Barang barang = listBarang.get(index);
            return barang.getStok();
        }
        return 0;
    }

    public int getListBarang() {
        return listBarang.size();
    }

    public Barang getBarang(int index) {
        return listBarang.get(index);
    }

    public void setBarang(Barang barang, int index) {
        listBarang.set(index, barang);
    }

    public void setNamaBarang(int index, String namaBarang) {
        listBarang.get(index).setNama(namaBarang);
    }

    public void setHargaBarang(int index, Double hargaBarang) {
        listBarang.get(index).setHarga(hargaBarang);
    }

    public void setStokBarang(int index, int stokBarang) {
        listBarang.get(index).setStok(stokBarang);
    }

    public void removeBarang(int index) {
        listBarang.remove(index);
    }
}
