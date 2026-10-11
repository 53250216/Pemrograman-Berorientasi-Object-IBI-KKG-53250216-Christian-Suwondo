/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class SegiTiga {
    private int alas, tinggi;
    private double luas;
    
    public void setAlas(int a) {
        if (a > 0) {
            this.alas = a;
        } else {
            this.alas = 0;
        }
    }
    public void setTinggi(int t) {
        if (t > 0) {
            this.tinggi = t;
        } else {
            this.tinggi = 0;
        }
    }
    
    public double getLuas() {
        this.luas = this.alas * this.tinggi * 0.5;
        return this.luas;
    }
}
