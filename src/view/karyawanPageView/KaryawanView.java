package view.karyawanPageView;

import java.util.Scanner;

import view.*;

public class KaryawanView {
    String id, password;
    int pilih;
    Scanner inp = new Scanner(System.in);

    public void loginKaryawanView() {
        // System.out.println("Silahkan Login");
        // System.out.print("id : ");
        // id = inp.next();
        // System.out.print("password : ");
        // password = inp.next();
        // int cekLogin = objC.karyawanC.loginKaryawan(id, password);
        int cekLogin = 1;
        if (cekLogin != -1) {
            String namaAdmin = objC.karyawanC.getKaryawan(cekLogin).getNama();
            do {
                System.out.print("\033[H\033[2J");
                System.out.flush();
                System.out.println("=================================");
                System.out.println("|   Selamat datang " + namaAdmin + " di   |");
                System.out.println("|        sistem Admin           |");
                System.out.println("|-------------------------------|");
                System.out.println("| Sistem Barang                 |");
                System.out.println("| 1. Tambah barang              |");
                System.out.println("| 2. Edit barang                |");
                System.out.println("| 3. Lihat barang               |");
                System.out.println("| 4. Hapus barang               |");
                System.out.println("|-------------------------------|");
                System.out.println("| Sistem Member                 |");
                System.out.println("| 5. Tambah member              |");
                System.out.println("| 6. Edit member                |");
                System.out.println("| 8. Hapus member               |");
                System.out.println("| 9. Lihat semua member         |");
                System.out.println("| 10. Lihat transaksi hari ini  |");
                System.out.println("==================================");
                System.out.print("pilih = ");
                pilih = inp.nextInt();
            } while (pilih != 0);
        }

    }
}
