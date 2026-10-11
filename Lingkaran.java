/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class Lingkaran {
    private int jejari;
    private double luas;
    
    public void setJejari(int r) {
        if (r > 0) {
            this.jejari = r;
        } else {
            this.jejari = 0;
        }
    }
    
    public double getLuas() {
        this.luas = Math.PI * Math.pow(this.jejari, 2);
        return this.luas;
    }
}
