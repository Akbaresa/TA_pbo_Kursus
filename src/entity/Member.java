package entity;

public class Member {
    protected String nama;
    protected String password;

    public Member(String nama, String password) {
        this.nama = nama;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public String getPassword() {
        return password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
