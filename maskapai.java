package kasus1;

public class maskapai {
    private String kode_maskapai;
    private penumpang[] daftarPenumpang = new penumpang[10];
    private int jumlahPenumpang = 0;

    public maskapai(String kode_maskapai) {
        this.kode_maskapai = kode_maskapai;
    }

    public void addPenumpang(penumpang p) {
        if (jumlahPenumpang < daftarPenumpang.length) {
            daftarPenumpang[jumlahPenumpang] = p;
            jumlahPenumpang++;
        }
    }

    public void tampilkanData() {
        System.out.println("Kode Maskapai: " + kode_maskapai);
        System.out.println("Daftar Penumpang:");
        for (int i = 0; i < jumlahPenumpang; i++) {
            System.out.println("ID: " + daftarPenumpang[i].getId_penumpang() + 
                               " | Nama: " + daftarPenumpang[i].getNama_penumpang());
        }
    }
}