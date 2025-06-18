package tema2_exemplu_subiect_examen;

public class Tranzactie {
    private int codProdus, cantitate;
    private String tip;

    public Tranzactie(int codProdus, int cantitate, String tip) {
        this.codProdus = codProdus;
        this.cantitate = cantitate;
        this.tip = tip;
    }

    public int getCodProdus() {
        return codProdus;
    }

    public int getCantitate() {
        return cantitate;
    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Tranzactie{" + "codProdus=" + codProdus + ", cantitate=" + cantitate + ", tip='" + tip + '\'' + '}';
    }
}
