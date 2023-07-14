package view;

import view.karyawanPageView.KaryawanView;

public class Main {
    public static void main(String[] args) {
        objC.barangC.insertBarang();
        objC.pembeliC.insertPembeli();
        objC.karyawanC.insertKaryawan();
        // HomePage homePage = new HomePage();
        // homePage.HomeView();
        new KaryawanView().loginKaryawanView();
    }
}
