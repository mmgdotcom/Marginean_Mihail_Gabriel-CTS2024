package tema2_exemplu_subiect_examen;

public class Produs {
    private int codProdus;
    private String denumire;
    private double pret;

    public Produs(int codProdus, String denumire, double pret) {
        this.codProdus = codProdus;
        this.denumire = denumire;
        this.pret = pret;
    }

    public int getCodProdus() {
        return codProdus;
    }

    public String getDenumire() {
        return denumire;
    }

    public double getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Produs{" + "codProdus=" + codProdus + ", denumire='" + denumire + '\'' + ", pret=" + pret + '}';
    }
}
