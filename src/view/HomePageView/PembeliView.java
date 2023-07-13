package view.HomePageView;

import java.util.Scanner;

public class PembeliView {
    Scanner inp = new Scanner(System.in);
    int pilih;

    public void pembeliView() {

        do {
            System.out.println("Selamat datang di sistem pembelian");
            new ShowBarang().showBarang();
            System.out.print("pilih = ");
            pilih = inp.nextInt();
        } while (pilih != 0);
    }
}
