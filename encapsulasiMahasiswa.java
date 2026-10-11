/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class encapsulasiMahasiswa {
    private int nim;
    private String nama, jurusan, matkul;
    
    public void setNIM(int nim) {
        this.nim = nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
    public void setMatkul(String matkul) {
        this.matkul = matkul;
    }
    
    public int getNIM() {
        return nim;
    }
    public String getNama() {
        return nama;
    }
    public String getJurusan() {
        return jurusan;
    }
    public String getMatkul() {
        return matkul;
    }
}
