package Pertemuan_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Christian Suwondo 53250216
 */

import java.util.Scanner;
public class kotak_IO {
    int panjang, lebar, tinggi;
    
    void cetakKotak() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Aplikasi Menghitung Volume Kotak");
        System.out.println("================================");
        
        System.out.print("Input Nilai Panjang = ");
        panjang = input.nextInt();
        System.out.print("Input Nilai Lebar   = ");
        lebar = input.nextInt();
        System.out.print("Input Nilai Tinggi  = ");
        tinggi = input.nextInt();
        
        int volume = panjang * lebar * tinggi;
        System.out.println("Nilai Volume Kotak = " + volume + " cm");
    }
}
