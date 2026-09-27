package Pertemuan_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Christian Suwondo 53250216
 */
public class manusiaBeraksi {
    public static void main(String[] args) {
        manusia dataSaya = new manusia();
        
        dataSaya.nama = "Christian";
        dataSaya.jenisKelamin = "Laki-Laki";
        dataSaya.alamat = "JL. Panda Lestari Blok I 2 No 46";
        dataSaya.usia = 19;
        
        dataSaya.getPrint();
    }
}
