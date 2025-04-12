package intalnire_1_8_martie_4;

public class Nota {
    String denumire;
    int valoare;

    //constructor fara parametri
    public Nota() {
        this.denumire = "";
        this.valoare = 0;
    }

    //constructor cu un parametru
    public Nota(String denumire) {
        this.denumire = denumire;
        this.valoare = 0;
    }

    //constructor cu doi parametri
    public Nota(String denumire, int valoare) {
        this.denumire = denumire;
        this.valoare = valoare;
    }

    public String getDenumire() {
        return this.denumire;// = denumire;
    }

    public int getValoare() {
        return this.valoare;// = valoare;
    }

    public Nota setdenumire(String denumire) {
        this.denumire = denumire;
        return this;
    }

    public Nota setValoare(int valoare) {
        this.valoare = valoare;
        return this;
    }

    @Override public String toString() {
        return "denumire: " + denumire + "; valoare: " + valoare;
    }
}
