package kasus2;

public class dataGaji {
    private String bulan;
    private double gapok;
    private double tunjangan;
    private double totalGaji;
    private karyawan pegawai;

    public dataGaji(String bulan, double gapok, double tunjangan, karyawan pegawai) {
        this.bulan = bulan;
        this.gapok = gapok;
        this.tunjangan = tunjangan;
        this.totalGaji = gapok + tunjangan;
        this.pegawai = pegawai;
    }

    public void tampilkanPenggajian() {
        System.out.println("Bulan: " + bulan);
        System.out.println("NIP: " + pegawai.getNip());
        System.out.println("Nama: " + pegawai.getNama());
        System.out.println("Jabatan: " + pegawai.getJabatan());
        System.out.println("Gaji Pokok: Rp" + gapok);
        System.out.println("Tunjangan: Rp" + tunjangan);
        System.out.println("Total Gaji: Rp" + totalGaji);
        System.out.println("----------------------------------------");
    }
}