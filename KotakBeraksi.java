package Pertemuan_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Christian Suwondo 53250216
 */
public class KotakBeraksi {
    public static void main(String[] args) {
        kotak Kotak = new kotak();
        
        Kotak.panjang = 6;
        Kotak.lebar = 3;
        Kotak.tinggi = 6;
        
        double volume = Kotak.panjang * Kotak.lebar * Kotak.tinggi;
        
        System.out.println("Panjang Kotak adalah : " + Kotak.panjang + " cm");
        System.out.println("Lebar Kotak adalah   : " + Kotak.lebar + " cm");
        System.out.println("Tinggi Kotak adalah   : " + Kotak.tinggi + " cm");
        System.out.println("------------------------------------");
        System.out.println("Volume Kotak adalah   : " + volume + " cm");
    }
}
