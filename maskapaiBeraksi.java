package kasus1;

public class maskapaiBeraksi {
    public static void main(String[] args) {
        maskapai m = new maskapai("GA-123");

        penumpang p1 = new penumpang(101, "Budi Santoso");
        penumpang p2 = new penumpang(102, "Siti Aminah");

        m.addPenumpang(p1);
        m.addPenumpang(p2);

        m.tampilkanData();
    }
}