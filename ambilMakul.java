package asosiasi;

/**
 * @author Christian Suwondo
 */
public class ambilMakul {
    public static void main(String[] args) {
        // Data 1
        mataKuliah makul1 = new mataKuliah("KD001", "1. Pemrograman Berorientasi Objek");
        mataKuliah makul2 = new mataKuliah("KD002", "2. Bahasa Inggris");
        mahasiswa2 mhs1 = new mahasiswa2("44240077", "Yulia Khairunnisa");

        // Data 2
        mataKuliah makul3 = new mataKuliah("KD001", "1. Struktur Data dan Algoritma");
        mataKuliah makul4 = new mataKuliah("KD002", "2. Perancangan Basis Data");
        mahasiswa2 mhs2 = new mahasiswa2("46240008", "Zidane Zulfan Zhari");

        // Relasi Mahasiswa 1
        mhs1.setKodeMakul(makul1.getNmMakul());
        mhs1.setKodeMakul(makul2.getNmMakul());
        mhs1.daftarMakul();

        System.out.println();

        // Relasi Mahasiswa 2
        mhs2.setKodeMakul(makul3.getNmMakul());
        mhs2.setKodeMakul(makul4.getNmMakul());
        mhs2.daftarMakul();
    }
}