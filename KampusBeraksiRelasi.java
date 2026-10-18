/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

import Pertemuan_6.MahasiswaRelasi;
import Pertemuan_6.DosenRelasi;

/**
 *
 *@author Christian Suwondo
 */
public class KampusBeraksiRelasi {
    //main class
    public static void main(String[] args) {
        MahasiswaRelasi m1 = new MahasiswaRelasi();
        m1.setNim("59230047");
        m1.setNama("Andrew Albertius");
      
        MahasiswaRelasi m2 = new MahasiswaRelasi();
        m2.setNim("56230149");
        m2.setNama("Apriliyana Juslan");
        
        DosenRelasi d = new DosenRelasi();
        d.setKodeDosen("MBL");
        
        d.setNimMhs(m1.getNim());
        d.setNimMhs(m2.getNim());
        
        System.out.println("Kode Dosen = " + d.getKodeDosen());
        System.out.println("Mengajar Mahasiswa");
        
        int jum = d.getJumlahMhs();
        
        for (int i = 0; i < jum; i++) {
            System.out.println(d.getNimMhs(i));
        }
    }
}
