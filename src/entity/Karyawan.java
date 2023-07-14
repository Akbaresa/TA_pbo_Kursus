package entity;

public class Karyawan extends Member {
    private String id;

    public Karyawan(String id, String nama, String password) {
        super(nama, password);
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
