package controller;

import entity.Karyawan;

public class KaryawanController {
    public void insertKaryawan() {
        // memasukkan ke array biasa
        String idKaryawan[] = {
                "07200", "07201", "07202"
        };
        String namaKaryawan[] = {
                "esa", "maulana", "akbar"
        };
        String passwordKaryawan[] = {
                "12", "12", "12"
        };
        for (int i = 0; i < namaKaryawan.length; i++) {
            AllModelObject.karyawan.addKaryawan(new Karyawan(idKaryawan[i], namaKaryawan[i], passwordKaryawan[i]));
        }
    }

    public Karyawan getKaryawan(int index) {
        return AllModelObject.karyawan.getKaryawan(index);
    }
}
