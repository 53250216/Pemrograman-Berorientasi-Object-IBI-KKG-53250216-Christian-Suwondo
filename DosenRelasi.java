/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

/**
 *
 *@author Christian Suwondo
 */
public class DosenRelasi {
    //deklarasi attribut/property
    private String kodeDosen;
    private final String[] nimMhs = new String[3];
    private int jumlahMhs;
    
    public void setKodeDosen (String kodeDosen) {
        this.kodeDosen = kodeDosen;
    }
    
    public void setNimMhs (String nimMhs) {
        if (jumlahMhs < this.nimMhs.length) {
            this.nimMhs[jumlahMhs] = nimMhs;
            jumlahMhs++;
        }
    }
    
    //create method get
    public String getKodeDosen () {
        return kodeDosen;
    }
    
    public int getJumlahMhs () {
        return jumlahMhs;
    }
    
    public String getNimMhs (int indeks) {
        return nimMhs[indeks];
    }
}
