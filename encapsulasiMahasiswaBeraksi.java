/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class encapsulasiMahasiswaBeraksi {
    public static void main(String[] args) {
        encapsulasiMahasiswa mhs = new encapsulasiMahasiswa();
        
        mhs.setNIM(57250021);
        mhs.setNama("Christian Suwondo");
        mhs.setJurusan("Teknik Informatika");
        mhs.setMatkul("Pemrograman Berorientasi Objek");
        
        System.out.println("Nomor Induk Mahasiswa = " + mhs.getNIM());
        System.out.println("Nama Mahasiswa = " + mhs.getNama());
        System.out.println("Jurusan Mahasiswa = " + mhs.getJurusan());
        System.out.println("Mata Kuliah Mahasiswa = " + mhs.getMatkul());
    }
    
}
