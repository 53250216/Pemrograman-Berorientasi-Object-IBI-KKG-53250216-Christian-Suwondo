package relasiClass;

/**
 * @author Christian Suwondo
 */
public class jurusan2_Agregasi {
    private String kode;
    private String nama;
    private mahasiswaAgregasi[] daftarMhs = new mahasiswaAgregasi[10];
    private int jumlahMhs;

    public jurusan2_Agregasi(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
    }

    public String getKode() {
        return this.kode;
    }

    public String getNama() {
        return this.nama;
    }

    public int getJumlahMhs() {
        return this.jumlahMhs;
    }

    public void addMahasiswa(mahasiswaAgregasi m) {
        if (jumlahMhs < this.daftarMhs.length) {
            daftarMhs[jumlahMhs] = m;
            jumlahMhs++;
        }
    }

    public mahasiswaAgregasi[] getDaftarMhs() {
        return daftarMhs;
    }

    public void displayData() {
        System.out.println("Kode Jurusan = " + this.kode);
        System.out.println("Nama Jurusan = " + this.nama);
        for (mahasiswaAgregasi m : daftarMhs) {
            if (m != null) {
                System.out.println(m.getNim() + " " + m.getNama());
            }
        }
    }
}