/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class persegiPanjangBeraksi {
    public static void main(String[] args) {
        persegiPanjang_1 pp = new persegiPanjang_1();
        
        pp.setPanjang(9);
        pp.setLebar(10);
        double luasABCD = pp.getLuas();
        
        System.out.println("Panjang = " + pp.getPanjang() + " cm");
        System.out.println("Lebar = " + pp.getLebar() + " cm");
        System.out.println("Luas = " + luasABCD + " cm2");
    }
}
