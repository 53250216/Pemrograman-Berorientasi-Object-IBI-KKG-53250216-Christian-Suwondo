package Pertemuan_2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 * @author Christian Suwondo 53250216
 */
public class mahasiswaBeraksi {
    public static void main(String[] args) {
        mahasiswa data_mahasiswa = new mahasiswa();
        
        data_mahasiswa.nim = 53250216;
        data_mahasiswa.nama = "Christian Suwondo";
        data_mahasiswa.alamat = "JL. Panda Lestari 2 Blok I 2 No 46";
        data_mahasiswa.jurusan = "Teknik Informatika";
        
        System.out.println("    Data Mahasiswa  ");
        System.out.println("-----------------------");
        System.out.println("Nomor Induk Mahasiswa       = " + data_mahasiswa.nim);
        System.out.println("Nama Mahasiswa              = " + data_mahasiswa.nama);
        System.out.println("Alamat Mahasiswa            = " + data_mahasiswa.alamat);
        System.out.println("Jurusan Mahasiswa           = " + data_mahasiswa.jurusan);
    }
}
