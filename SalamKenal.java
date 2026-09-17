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
import java.util.Scanner;
public class SalamKenal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("Input Nama Anda = ");
        String nama = input.nextLine();
        //output
        System.out.println("Hallo, Salam Kenal Mas " + nama + "!");
    }
}
