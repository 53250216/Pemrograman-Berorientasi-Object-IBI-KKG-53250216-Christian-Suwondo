/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author Christian Suwondo 53250216
 */
public class encapsulasiUserBeraksi {
    public static void main(String[] args) {
        encapsulasiUser user = new encapsulasiUser();
        
        user.setUsername("Christian Suwondo");
        user.setPassword("user123");
        
        System.out.println("Username =  " + user.getUsername());
        System.out.println("Username =  " + user.getPassword());
    }
}
