package view.pembeliPageView;

import java.util.Scanner;
import view.*;
import utils.*;
import java.time.LocalDate;

public class MemberView {
    Scanner inp = new Scanner(System.in);
    int pilih;
    String pilihan;
    Double bayar;
    LocalDate localDate = LocalDate.now();

    public Double loginMember(Double totalBeli) {
        System.out.println("apakah anda mempunyai kartu member ? (y/t)");
        pilihan = inp.next();
        if (pilihan.equals("y")) {
            System.out.println("Silahkan login");
            System.out.print("masukkan nama : ");
            String nama = inp.next();
            System.out.print("masukkan password : ");
            String password = inp.next();
            int hasil = objC.pembeliC.loginMember(nama, password);
            if (hasil != -1) {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("-------------------------------------------");
                System.out.println("halo selamat datang " + objC.pembeliC.getPembeli(hasil).getNama());
                System.out.println("tanggal " + localDate);
                System.out.println("saldo anda        : " +
                        Format.formatRupiah(objC.pembeliC.getPembeli(hasil).getUang()));
                System.out.println("total Harga       : " + Format.formatRupiah(totalBeli));
                System.out.println("update saldo anda : "
                        + Format.formatRupiah(objC.pembeliC.getPembeli(hasil).getUang() - totalBeli));
                System.out.println("-------------------------------------------");
                return objC.pembeliC.getPembeli(hasil).getUang();
            } else {
                System.out.print("masukkan uang anda untuk membayar : ");
                bayar = inp.nextDouble();
                return bayar;
            }

        } else {
            System.out.print("masukkan uang anda untuk membayar : ");
            bayar = inp.nextDouble();
        }
        return bayar;
    }

}