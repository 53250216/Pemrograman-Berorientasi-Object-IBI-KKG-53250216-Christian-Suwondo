package asosiasi;

/**
 * @author Christian Suwondo
 */
public class mahasiswa2 {
    private String nim;
    private String nama;
    protected String[] kodeMakul = new String[2];
    protected String[] namaMakul = new String[2];
    private int jmlMakul = 0;

    // Method Konstruktor
    public mahasiswa2(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    // Setter untuk relasi
    public void setKodeMakul(String kdMakul) {
        kodeMakul[jmlMakul] = kdMakul;
        jmlMakul++;
    }

    public void setNamaMakul(String nmMakul) {
        namaMakul[jmlMakul] = nmMakul;
        jmlMakul++;
    }

    // Getter
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getJmlMakul() {
        return jmlMakul;
    }

    // Method menampilkan data
    public void daftarMakul() {
        System.out.println("Nomor Induk Mahasiswa : " + nim);
        System.out.println("Nama Mahasiswa        : " + nama);
        System.out.println("Mata Kuliah yang diambil :");
        for (int i = 0; i < jmlMakul; i++) {
            System.out.println(kodeMakul[i]);
        }
    }
}
