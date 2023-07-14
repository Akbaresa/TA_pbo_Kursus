package view;

import java.util.Scanner;

import view.karyawanPageView.KaryawanView;
import view.pembeliPageView.*;

public class HomePage {
    int pilih;
    Scanner inp = new Scanner(System.in);

    public void HomeView() {

        do {

            System.out.println("Selamat datang di Betamart");
            System.out.println("Masuk sebagai : ");
            System.out.println("1. Admin");
            System.out.println("2. Pembeli");
            System.out.println("0. exit");
            System.out.print("pilih = ");
            pilih = inp.nextInt();
            switch (pilih) {
                case 1:
                    new KaryawanView().loginKaryawanView();
                    break;
                case 2:
                    new PembeliView().pembeliView();
                    break;
                default:
                    break;
            }
        } while (pilih != 3);
    }
}
