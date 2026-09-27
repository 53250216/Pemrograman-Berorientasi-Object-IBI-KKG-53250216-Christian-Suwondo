package Pertemuan_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Christian Suwondo 53250216
 */

import java.util.Scanner;
public class lingkaran2 {
    double r;
    double Pi = 3.141592;
    
    void hitungLuas() {
        Scanner jariJari = new Scanner(System.in);
        
        System.out.println("Aplikasi Menghitung Luas Lingkaran");
        System.out.println("==================================");
        System.out.print("Masukkan Nilai Jari-Jari      = ");
        
        r = jariJari.nextDouble();
        double luas = Pi * r * r;
        
        System.out.println("Luas Lingkaran = " + luas + " cm2");
    }
}
