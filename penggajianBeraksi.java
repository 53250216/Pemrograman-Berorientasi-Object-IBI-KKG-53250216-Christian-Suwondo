package kasus2;

public class penggajianBeraksi {
    public static void main(String[] args) {
        karyawan k1 = new karyawan("202401", "Andi", "Jakarta", "Manager", "Laki-laki", "Islam");
        karyawan k2 = new karyawan("202402", "Rina", "Bogor", "Staff", "Perempuan", "Kristen");

        dataGaji g1 = new dataGaji("Oktober 2024", 8000000, 2000000, k1);
        dataGaji g2 = new dataGaji("Oktober 2024", 5000000, 1000000, k2);

        System.out.println("=== DATA PENGGAJIAN OKTOBER 2024 ===");
        g1.tampilkanPenggajian();
        g2.tampilkanPenggajian();
    }
}