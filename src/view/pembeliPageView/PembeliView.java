package view.pembeliPageView;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import utils.*;
import view.objC;

public class PembeliView {
    MemberView member = new MemberView();
    Scanner inp = new Scanner(System.in);
    LocalDate localDate = LocalDate.now();
    int pilih;
    String bayar;

    List<String> namaBarangList = new ArrayList<>(); // Menyimpan nama barang yang dibeli
    List<Double> hargaBarangList = new ArrayList<>(); // Menyimpan harga barang yang dibeli
    Double totalHarga = 0.0; // Menyimpan total harga pembelian

    public void pembeliView() {
        try {

            System.out.println("Selamat datang di sistem pembelian");

            do {
                new ShowBarang().showBarang();
                System.out.print("pilih = ");
                pilih = inp.nextInt();

                if (pilih != 0) {
                    String namaBarang = objC.barangC.getNamaBarang(pilih - 1);
                    Double hargaBarang = objC.barangC.getHargaBarang(pilih - 1);

                    namaBarangList.add(namaBarang); // Menambahkan nama barang ke dalam list
                    hargaBarangList.add(hargaBarang); // Menambahkan harga barang ke dalam list
                    totalHarga += hargaBarang; // Menambahkan harga barang ke total harga

                    System.out.println("\nBarang yang anda beli");
                    System.out.println("========================================");
                    System.out.println("| No |      Nama Barang      |   Harga  |");
                    System.out.println("========================================");
                    for (int i = 0; i < namaBarangList.size(); i++) {
                        String no = String.format("| %2d |", i + 1);
                        String nama = String.format("%-21s", namaBarangList.get(i));
                        String harga = String.format("| %7.2f |", hargaBarangList.get(i));
                        System.out.println(no + nama + harga);
                    }
                    System.out.println("========================================");
                    System.out.println("Apakah anda mau membeli barang lagi ?(y/t)");
                    bayar = inp.next();
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                }
            } while (bayar.equals("y"));
            System.out.println("Total harga: " + totalHarga);
            Double bayar = member.loginMember(totalHarga);
            if (bayar > 0) {
                System.out.println("\nStruk Transaksi");
                System.out.println("-------------------------------------------");
                System.out.println("Transaksi Tanggal " + localDate);
                System.out.println("Uang Anda : " + Format.formatRupiah(bayar));
                System.out.println("Kembalian : " + Format.formatRupiah(bayar - totalHarga));
                System.out.println("-------------------------------------------");

            }
            System.out.println("terimakasih telah berbelanja di sini\n\n");
        } catch (Exception e) {
            System.out.println("input yang anda masukkan tidak valid");
        }

    }

    // // LocalDate localDate = LocalDate.now();
    // Double hasil = member.loginMember();

    // public void strukView() {
    // System.out.println("------------");
    // // System.out.println("tanggal = " + localDate);
    // System.out.println("\nBarang yang anda beli");
    // System.out.println("========================================");
    // System.out.println("| No | Nama Barang | Harga |");
    // System.out.println("========================================");
    // for (int i = 0; i < namaBarangList.size(); i++) {
    // String no = String.format("| %2d |", i + 1);
    // String nama = String.format("%-21s", namaBarangList.get(i));
    // String harga = String.format("| %7.2f |", hargaBarangList.get(i));
    // System.out.println(no + nama + harga);
    // }

    // System.out.println("Total Uang : " + hasil);
    // System.out.println("Kembalian : " + (hasil - totalHarga));
    // }
}