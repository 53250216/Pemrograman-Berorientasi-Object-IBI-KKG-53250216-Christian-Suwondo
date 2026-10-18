/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

/**
 *
 *@author Christian Suwondo
 */
public class Karyawan {
    private String nip;
    private String nama;
    private String alamat;
    private String jabatan;
    private String jenisKelamin;
    private String agama;

    // Constructor
    public Karyawan(String nip, String nama, String alamat, String jabatan, String jenisKelamin, String agama) {
        this.nip = nip;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
        this.jenisKelamin = jenisKelamin;
        this.agama = agama;
    }

    public String getNip() { return nip; }
    public void setNip(String nip) { this.nip = nip; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public String getAlamat() { return alamat; }
    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getJabatan() { return jabatan; }
    public void setJabatan(String jabatan) { this.jabatan = jabatan; }

    public String getJenisKelamin() { return jenisKelamin; }
    public void setJenisKelamin(String jenisKelamin) { this.jenisKelamin = jenisKelamin; }

    public String getAgama() { return agama; }
    public void setAgama(String agama) { this.agama = agama; }
}
