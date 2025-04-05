package intalnire_1_8_martie_2;

public class Nota {
    String denumire;
    int valoare;

    Nota() {
        this.denumire = "Unknown";
        this.valoare = 0;
    }

    Nota(String denumire) {
        this.denumire = denumire;
        this.valoare = 0;
    }

    Nota (String denumire, int valoare) {
        this.denumire = denumire;
        this.valoare = valoare;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getValoare() {
        return valoare;
    }

    public void setDenumire(String newDenumire) {
        this.denumire = newDenumire;
    }

    public void setValoare(int newValoare) {
        this.valoare = newValoare;
    }

    @Override
    public String toString() {
        return "denumire: " + denumire + "; valoare: " + valoare;
    }

    public static void main(String[] args) {
        Nota nota1 = new Nota("matematica", 10);
        Nota nota2 = new Nota("istorie", 8);
        System.out.println("Nota1: " + nota1);
        System.out.println("Nota2: "+ nota2);
    }
}
