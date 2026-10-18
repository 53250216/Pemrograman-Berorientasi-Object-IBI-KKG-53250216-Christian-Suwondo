/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan_6;

/**
 *
 *@author Christian Suwondo
 */
public class Orders {
    private String invoice;
    private String currDate;
    private Customer customer;

    public void setInvoice(String invoice) {
        this.invoice = invoice;
    }
    public String getInvoice() {
        return invoice;
    }

    public void setCurrDate(String currDate) {
        this.currDate = currDate;
    }
    public String getCurrDate() {
        return currDate;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Customer getCustomer() {
        return customer;
    }

    public void index() {
        System.out.println("Invoice: " + invoice + " | Date: " + currDate);
    }

    public void preSales() {
        System.out.println("Processing pre-sales for invoice " + invoice);
    }
}