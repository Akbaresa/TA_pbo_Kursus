package controller;

import interfaces.KaryawanInterface;
import model.BarangModel;
import model.KaryawanModel;
import model.PembeliModel;

public class AllModelObject {
    // membuat object dari yang nantinya akan dipakai di controller
    public static BarangModel barang = new BarangModel();
    public static KaryawanInterface karyawan = new KaryawanModel();
    public static PembeliModel pembeli = new PembeliModel();
}
