/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class persegiPanjang_1{
    private int panjang, lebar;
    private double luas;
    
    public void setPanjang(int p) {
        if (p > 0) {
            this.panjang = p;
        } else {
            this.panjang = 0;
        }
    }
    
    public void setLebar(int l) {
        if (l > 0) {
            this.lebar = l;
        } else {
            this.lebar = 0;
        }
    }
    
    
    public int getPanjang() {
        return panjang;
    }
    public int getLebar() {
        return lebar;
    }
    public double getLuas() {
        this.luas = this.panjang * this.lebar;
        return this.luas;
    }
}
