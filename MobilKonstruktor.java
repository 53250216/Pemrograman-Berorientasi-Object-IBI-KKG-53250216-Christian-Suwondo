/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class MobilKonstruktor {
     String warna;
     int tahunProduksi;

    public MobilKonstruktor(String warna, int tahunProduksi) {
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
     

     void info(){
         System.out.println("Warna Mobil    = "+ warna);
         System.out.println("Tahun Produksi    = "+ tahunProduksi);
     }
}
