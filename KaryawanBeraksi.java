/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;


/**
 *
 *@author Christian Suwondo
 */
public class KaryawanBeraksi {
    public static void main(String[] args) {
        Karyawan kar1 = new Karyawan("K001", "Christian Suwondo", "Jl. Panda Lestari 2", "Content Creator", "Laki-laki", "Kristen");
        Karyawan kar2 = new Karyawan("K002", "Vaughan Nate Osvaldo", "Jl. Thamrin No. 20", "Staff IT", "Laki-Laki", "Katolik");

        DataGaji gaji1 = new DataGaji(1, "Oktober 2026", 8000000, 2500000, kar1);
        DataGaji gaji2 = new DataGaji(2, "Oktober 2026", 5000000, 1500000, kar2);

        System.out.println("=== LAPORAN PENGGAJIAN BULAN OKTOBER 2026 ===");
        gaji1.tampilkanDataGaji();
        gaji2.tampilkanDataGaji();
    }
}
