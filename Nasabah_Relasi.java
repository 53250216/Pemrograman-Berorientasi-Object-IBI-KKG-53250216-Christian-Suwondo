/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

/**
 *
 *@author Christian Suwondo
 */
public class Nasabah_Relasi {
    String nama;
    long ktp;
    Rekening_Relasi rek; 

    public Nasabah_Relasi() {
        nama = "kosong";
        ktp = 0;
        System.out.println("Nasabah baru dibuat...");
    }
    
    public Nasabah_Relasi(String n, long k) {
        nama = n;
        ktp = k;
        System.out.println("Nasabah " + nama + " dibuat...");
    }
    
    public Nasabah_Relasi(String n) {
        nama = n;
    }
    
    public Nasabah_Relasi(long k) {
        ktp = k;
    }
    
    public void bukarekening(Rekening_Relasi r) {
        rek = r;
        System.out.println(nama + " Sukses buka rekening");
    }
}
