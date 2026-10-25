package relasiClass;

/**
 * @author Christian Suwondo
 */
public class Main2_Agregasi {
    public static void main(String[] args) {
        // Membuat Objek Jurusan
        jurusan2_Agregasi j = new jurusan2_Agregasi("DKV", "Desain Komunikasi Visual");

        // Objek Mahasiswa 1
        mahasiswaAgregasi m1 = new mahasiswaAgregasi();
        m1.setNim("43210195");
        m1.setNama("Dita Dwita Hayuning Tyas");

        // Objek Mahasiswa 2
        mahasiswaAgregasi m2 = new mahasiswaAgregasi();
        m2.setNim("56210008");
        m2.setNama("Nukky Sugandi");

        // Hubungkan Mahasiswa dengan Jurusan
        j.addMahasiswa(m1);
        j.addMahasiswa(m2);

        // Tampilkan Data
        j.displayData();
    }
}