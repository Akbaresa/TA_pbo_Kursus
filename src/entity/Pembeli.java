package entity;

public class Pembeli extends Member {

    private Double Uang;

    public Pembeli(String nama, String password, Double dompet) {
        super(nama, password);
        this.Uang = dompet;
    }

    public Double getUang() {
        return Uang;
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }
}
