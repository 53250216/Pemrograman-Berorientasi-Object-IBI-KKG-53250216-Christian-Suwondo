package asosiasi;

/**
 * @author Christian Suwondo
 */
public class mataKuliah {
    private String kdMakul;
    private String nmMakul;

    // Method Konstruktor
    public mataKuliah(String kdMakul, String nmMakul) {
        this.kdMakul = kdMakul;
        this.nmMakul = nmMakul;
    }

    // Getter
    public String getKdMakul() {
        return kdMakul;
    }

    public String getNmMakul() {
        return nmMakul;
    }
}
