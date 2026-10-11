/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class encapsulasiBukuBeraksi {
    public static void main(String[] args) {
        encapsulasiBuku buku = new encapsulasiBuku();
        
        buku.setJudul("Pengantar Pemrograman berbasis objek dengan PHP");
        buku.setPenulis("Stefan Leonard");
        buku.setISBN("978-632-00-5090-9");
        buku.setTahun(2022);
        buku.setHarga(50000);
        
        System.out.println("Judul Buku = " + buku.getJudul());
        System.out.println("Penulis Buku = " + buku.getPenulis());
        System.out.println("ISBN Buku = " + buku.getISBN());
        System.out.println("Harga Buku = " + buku.getTahun());
        System.out.println("Tahun Terbit = " + buku.getHarga());
    }
}
