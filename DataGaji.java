/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

/**
 *
 * @author Christian Suwondo
 */
public class DataGaji {
    private final int noGaji;
    private final String bulan;
    private final int gapok;
    private final int tunjangan;
    private final int totalGaji;
    private final Karyawan nipPegawai;

    // Constructor
    public DataGaji(int noGaji, String bulan, int gapok, int tunjangan, Karyawan nipPegawai) {
        this.noGaji = noGaji;
        this.bulan = bulan;
        this.gapok = gapok;
        this.tunjangan = tunjangan;
        this.nipPegawai = nipPegawai;
        this.totalGaji = this.gapok + this.tunjangan;
    }

    // Method untuk menampilkan data
    public void tampilkanDataGaji() {
        System.out.println("No Gaji        : " + noGaji);
        System.out.println("Bulan          : " + bulan);
        System.out.println("NIP Karyawan   : " + nipPegawai.getNip());
        System.out.println("Nama Karyawan  : " + nipPegawai.getNama());
        System.out.println("Jabatan        : " + nipPegawai.getJabatan());
        System.out.println("Gaji Pokok     : Rp " + gapok);
        System.out.println("Tunjangan      : Rp " + tunjangan);
        System.out.println("Total Gaji     : Rp " + totalGaji);
        System.out.println("----------------------------------------");
    }
}