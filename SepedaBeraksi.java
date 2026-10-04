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
public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda spd = new Sepeda();
        
        spd.setGir(1);
        System.out.println("Nilai Gir Awal      = " + spd.getGir());
        
        spd.setGir(3);
        System.out.println("Nilaai Gir Sekarang = " + spd.getGir());
    }
}
