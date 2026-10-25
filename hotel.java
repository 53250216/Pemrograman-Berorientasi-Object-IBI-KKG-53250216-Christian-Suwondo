package kasus3;

import java.util.ArrayList;
import java.util.List;

public class hotel {
    private int id_booking;
    private String kode_hotel;
    private int lama;
    private String room;
    private double harga;
    private List<customer> data_cust;

    public hotel(int id_booking, String kode_hotel, int lama, String room, double harga) {
        this.id_booking = id_booking;
        this.kode_hotel = kode_hotel;
        this.lama = lama;
        this.room = room;
        this.harga = harga;
        this.data_cust = new ArrayList<>();
    }

    public void addCustomer(customer cust) {
        data_cust.add(cust);
    }

    public List<customer> get_dataCust() {
        return data_cust;
    }

    public int getJumlahCust() {
        return data_cust.size();
    }

    public String getKode_hotel() {
        return kode_hotel;
    }

    public void tampilkanReservasi() {
        System.out.println("Kode Hotel  : " + kode_hotel);
        System.out.println("ID Booking  : " + id_booking);
        System.out.println("Tipe Room   : " + room);
        System.out.println("Lama Inap   : " + lama + " hari");
        System.out.println("Harga/Malam : Rp" + harga);
        System.out.println("Total Bayar : Rp" + (harga * lama));
        System.out.println("\n--- Data Customer (" + getJumlahCust() + " Orang) ---");
        for (customer c : data_cust) {
            System.out.println("ID Cust : " + c.getId_customer());
            System.out.println("Nama    : " + c.getNama());
            System.out.println("Telepon : " + c.getNo_telpon());
            System.out.println("Email   : " + c.getEmail());
            System.out.println("-----------------------------------");
        }
    }
}