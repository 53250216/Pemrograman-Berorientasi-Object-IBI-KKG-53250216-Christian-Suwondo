package kasus3;

public class hotelBeraksi {
    public static void main(String[] args) {
        hotel h = new hotel(551, "HTL-JKT01", 3, "Deluxe Suite", 750000);

        customer c1 = new customer(1, "Ahmad Subagja", "Jakarta", "08123456789", "ahmad@gmail.com");
        customer c2 = new customer(2, "Dewi Sartika", "Bandung", "08987654321", "dewi@gmail.com");

        h.addCustomer(c1);
        h.addCustomer(c2);

        h.tampilkanReservasi();
    }
}