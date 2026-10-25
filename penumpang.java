package kasus1;

public class penumpang {
    private int id_penumpang;
    private String nama_penumpang;

    public penumpang(int id_penumpang, String nama_penumpang) {
        this.id_penumpang = id_penumpang;
        this.nama_penumpang = nama_penumpang;
    }

    public int getId_penumpang() {
        return id_penumpang;
    }

    public String getNama_penumpang() {
        return nama_penumpang;
    }
}