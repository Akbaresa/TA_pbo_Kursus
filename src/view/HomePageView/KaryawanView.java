package view.HomePageView;

import java.util.Scanner;

public class KaryawanView {
    String nama, password;

    Scanner inp = new Scanner(System.in);

    public void loginKaryawanView() {
        System.out.println("Silahkan Login");
        System.out.print("nama : ");
        nama = inp.next();
        System.out.println("password : ");
        password = inp.next();

    }
}
