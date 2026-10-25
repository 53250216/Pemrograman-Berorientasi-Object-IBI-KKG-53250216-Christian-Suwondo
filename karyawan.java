package kasus2;

public class karyawan {
    private String nip;
    private String nama;
    private String alamat;
    private String jabatan;
    private String jenisKelamin;
    private String agama;

    public karyawan(String nip, String nama, String alamat, String jabatan, String jenisKelamin, String agama) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }
}