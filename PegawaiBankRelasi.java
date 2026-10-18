/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;



/**
 *
 *@author Christian Suwondo
 */
public class PegawaiBankRelasi {
    public static void main(String[] args) {
        PegawaiRelasi pegawai = new PegawaiRelasi();
        BankRelasi bank = new BankRelasi();
        
        pegawai.setNama("Christian Suwondo");
        bank.setNama("ABC");
        
        System.out.println(pegawai.getNama() + " Adalah Pegawai dari Bank " + bank.getNama());
    }
}
