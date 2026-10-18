/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

/**
 *
 *@author Christian Suwondo
 */
public class CustomerBeraksi {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setId(101);
        cust1.setName("Budi Santoso");
        cust1.setStatus(true);

        Customer cust2 = new Customer();
        cust2.setId(102);
        cust2.setName("Siti Rahma");
        cust2.setStatus(true);

        Orders ord1 = new Orders();
        ord1.setInvoice("INV-2026-001");
        ord1.setCurrDate("15-10-2026");
        ord1.setCustomer(cust1);

        Orders ord2 = new Orders();
        ord2.setInvoice("INV-2026-002");
        ord2.setCurrDate("15-10-2026");
        ord2.setCustomer(cust2);

        System.out.println("--- DAFTAR ORDER CUSTOMER ---");
        System.out.println("No. Invoice : " + ord1.getInvoice());
        System.out.println("Tanggal     : " + ord1.getCurrDate());
        System.out.println("Customer    : " + ord1.getCustomer().getName());
        System.out.println("-----------------------------");
        System.out.println("No. Invoice : " + ord2.getInvoice());
        System.out.println("Tanggal     : " + ord2.getCurrDate());
        System.out.println("Customer    : " + ord2.getCustomer().getName());
        System.out.println("-----------------------------");
    }
}
