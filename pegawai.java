/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan1;

/**
 *
 * @author lkb104
 */
public class pegawai {
    String Nama_Pegawai;
    String Alamat_Pegawai;
    String Jabatan_Pegawai;
    int Nomor_Induk_Pegawai;
    
    public static void main(String[] args) {
        pegawai Data_1 = new pegawai();
        
        Data_1.Alamat_Pegawai = "Kelapa Gading";
        Data_1.Jabatan_Pegawai = "Supervisor";
        Data_1.Nama_Pegawai = "Steven Hariyanto";
        Data_1.Nomor_Induk_Pegawai = 59230173;
        
        System.out.println("Nomor Induk Pegawai = " + Data_1.Nomor_Induk_Pegawai);
        System.out.println("Nama Pegawai = " + Data_1.Nama_Pegawai);
        System.out.println("Alamat Pegawai = " + Data_1.Alamat_Pegawai);
        System.out.println("Jabatan Pegawai = " + Data_1.Jabatan_Pegawai);
                
    }
}
