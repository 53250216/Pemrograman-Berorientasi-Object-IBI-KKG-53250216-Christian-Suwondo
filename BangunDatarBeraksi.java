/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class BangunDatarBeraksi {
    public static void main(String[] args) {
        SegiTiga st1 = new SegiTiga();
        st1.setAlas(8);
        st1.setTinggi(7);
        double luasABC = st1.getLuas();
        
        SegiTiga st2 = new SegiTiga();
        st2.setAlas(5);
        st2.setTinggi(6);
        double luasDEF = st2.getLuas();
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.setPanjang(14);
        pp1.setLebar(7);
        double luasABCD = pp1.getLuas();
        
        Lingkaran ll = new Lingkaran();
        ll.setJejari(7);
        double luasX = 0.5 * ll.getLuas();
        
        double luasArsir = luasABC + luasDEF + luasABCD - luasX;
        System.out.println("Aplikasi menghitung luas bangun diarsir");
        System.out.println("=============================================");
        System.out.println("Luas Segitiga ABC = " + luasABC + " cm2");
        System.out.println("Luas Segitiga DEF = " + luasDEF + " cm2");
        System.out.println("Luas Persegi Panjang ABCD = " + luasABCD + " cm2");
        System.out.println("Luas Setengah Lingkaran = " + luasX + " cm2");
        System.out.println("---------------------------------------------");
        System.out.println("Luas daerah diarsir = " + luasArsir + " cm2");
    }
}
