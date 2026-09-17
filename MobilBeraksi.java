/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author Christian Suwondo
 */
public class MobilBeraksi {
        public static void main(String[] args) {
       Mobil mobilku = new Mobil();
       Mobil mobildia = new Mobil();
       
        mobildia.warna = "Putih";
        mobildia.tahunProduksi = 2007;
        
        mobilku.warna = "Hitam";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna: " + mobilku.warna);
        System.out.println("Tahun: " + mobilku.tahunProduksi);
    }
}
