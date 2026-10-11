/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class Menu {
    private String menu;
    private double harga;
    private boolean spesial;
    
    public void setMenu(String menu) {
        this.menu = menu;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setSpesial(boolean spesial) {
        this.spesial = spesial;
    }
    
    public String getMenu() {
        return menu;
    }
    public double getHarga() {
        return harga;
    }
    public boolean getSpesial() {
        return spesial;
    }
}
