/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author lkb104
 */
public class mahasiswa {
    
    String nama,alamat;
    double ipk;
    
    void mhsGenius(){
        nama = "Christian Suwondo";
        alamat = "Gading Griya Lestari Blok I 2 No.48";
        ipk = 3.5;
        
        System.out.println("Mahasiswa Genius");
        System.out.println("================");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Alamat Mahasiswa = " + alamat);
        System.out.println("IPK Mahasiswa + "+ ipk);
    }
    
    void mhsPintar(){
        nama = "DesireToStudy";
        alamat = "Gading Nias Lt.5 No 54";
        ipk = 3.2;
        
        System.out.println("Mahasiswa Pintar");
        System.out.println("================");
        System.out.println("Nama Mahasiswa = " + nama);
        System.out.println("Alamat Mahasiswa = " + alamat);
        System.out.println("IPK Mahasiswa + "+ ipk);
    }
}
