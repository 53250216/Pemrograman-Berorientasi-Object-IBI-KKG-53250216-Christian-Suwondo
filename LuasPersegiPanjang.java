/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan_1;

/**
 *
 * @author Christian
 */

import java.util.Scanner;
public class LuasPersegiPanjang {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang, lebar, luas;
        System.out.println("Input Nilai Panjang = ");panjang = input.nextInt();
        System.out.println("Input Nilai Lebar = ");lebar = input.nextInt();
        
        luas=panjang * lebar;
         System.out.println("Luas Persegi Panjang = "+ luas + " cm");
    }
    
}
