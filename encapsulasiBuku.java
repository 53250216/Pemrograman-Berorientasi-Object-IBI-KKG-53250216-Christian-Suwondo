/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class encapsulasiBuku {
    private String judul, penulis, isbn;
    private int tahun, harga;
    
    public void setJudul(String judul) {
        this.judul = judul;
    }
    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }
    public void setISBN(String isbn) {
        this.isbn = isbn;
    }
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
    public void setHarga(int harga) {
        this.harga = harga;
    }
    
    public String getJudul() {
        return judul;
    }
    public String getPenulis() {
        return penulis;
    }
    public String getISBN() {
        return isbn;
    }
    public int getTahun() {
        return tahun;
    }
    public int getHarga() {
        return harga;
    }
}
