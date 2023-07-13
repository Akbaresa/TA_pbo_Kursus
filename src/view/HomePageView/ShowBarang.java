package view.HomePageView;

import java.util.List;

import entity.Barang;
import view.*;

public class ShowBarang {
    public void showBarang() {
        int totalBarang = objC.barangC.getListBarang();

        if (totalBarang == 0) {
            System.out.println("Tidak ada barang yang tersedia.");
        } else {
            System.out.println("========================================");
            System.out.println("| No |      Nama Barang      |   Harga  |");
            System.out.println("========================================");
            for (int i = 0; i < totalBarang; i++) {
                int barangIndex = i;
                String no = String.format("| %2d |", i + 1);
                String nama = String.format("%-21s", objC.barangC.getNamaBarang(barangIndex));
                String harga = String.format("| %7.2f |", objC.barangC.getHargaBarang(barangIndex));
                System.out.println(no + nama + harga);
            }
            System.out.println("========================================");
        }
    }

}
