package entity;

public class Barang {
    private String nama;
    private Double harga;
    private int stok;

    public Barang(String nama, Double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getNama() {
        return nama;
    }

    public Double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
}
