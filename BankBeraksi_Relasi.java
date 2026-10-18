/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;


/**
 *
 *@author Christian Suwondo
 */
public class BankBeraksi_Relasi {
        public static void main(String args[]) {
        Nasabah_Relasi ika = new Nasabah_Relasi("Ika", 123456789); 
        Rekening_Relasi bni = new Rekening_Relasi(123456789, 1000000);
        ika.bukarekening(bni); 
    }
}