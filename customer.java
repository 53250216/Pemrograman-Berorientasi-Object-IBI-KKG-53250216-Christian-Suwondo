package kasus3;

public class customer {
    private int id_customer;
    private String nama;
    private String alamat;
    private String no_telpon;
    private String email;

    public customer(int id_customer, String nama, String alamat, String no_telpon, String email) {
        this.id_customer = id_customer;
        this.nama = nama;
        this.alamat = alamat;
        this.no_telpon = no_telpon;
        this.email = email;
    }

    public int getId_customer() {
        return id_customer;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNo_telpon() {
        return no_telpon;
    }

    public String getEmail() {
        return email;
    }
}