/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class MenuBeraksi {
    public static void main(String[] args) {
        Menu data = new Menu();
        
        data.setMenu("Ayam Goreng");
        data.setHarga(16000);
        data.setSpesial(true);
        
        System.out.println("Harga Menu Makanan Rumah Makan ABC");
        System.out.println("-------------------------------------------");
        System.out.println("Menu Makanan = " + data.getMenu());
        System.out.println("Harga Makanan = " + data.getHarga());
        System.out.println("Menu Spesial = " + data.getSpesial());
    }
}
