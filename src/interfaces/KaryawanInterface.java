package interfaces;

import entity.Karyawan;

public interface KaryawanInterface {

    void addKaryawan(Karyawan karyawan);

    Karyawan getKaryawan(int index);

    int getListKaryawan();

    int loginKaryawan(String id, String password);

}