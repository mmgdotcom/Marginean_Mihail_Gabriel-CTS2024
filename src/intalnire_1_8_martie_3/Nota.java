package intalnire_1_8_martie_3;

public class Nota {
    String denumire;
    int valoare;

    public Nota() {
        this.denumire = "";
        this.valoare = 0;
    }

    public Nota(String newDenumire) {
        this.denumire = newDenumire;
        this.valoare = 0;
    }

    public Nota(String newDenumire, int newValoare) {
        this.denumire = newDenumire;
        this.valoare = newValoare;
    }

    public String getDenumire() {
        return this.denumire;
    }

    public int getValoare() {
        return this.valoare;
    }

    public void setDenumire(String newDenumire) {
        this.denumire = newDenumire;
    }

    public void setValoare(int newValoare) {
        this.valoare = newValoare;
    }

    @Override public String toString () {
        return "denumire: " + denumire + "valoare: " + valoare;
    }

}
