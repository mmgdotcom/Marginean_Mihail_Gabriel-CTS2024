package intalnire_1_8_martie;

public class Nota {
    String denumire;
    int valoare;

    //constructor fara parametri
    public Nota(){
        this.denumire = new String();
        this.valoare = 0;
    }

    //contructor cu un paramtru
    public Nota(String denumire) {
        this.denumire = denumire;
        this.valoare = 0;
    }

    //constructor cu doi(toti) paramtri
    public Nota (String denumire, int valoare) {
        this.denumire = denumire;
        this.valoare = valoare;
    }

    public String getDenumire() {
        return denumire;
    }

    public int getValoare() {
            return valoare;
        }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public void setValoare(int valoare) {
        this.valoare = valoare;
    }

    @Override public String toString() {
        return "denumire: " + denumire + "; valoare: " + valoare;
    }

    public static void main(String[] args) {
        Nota nota1 = new Nota("Matematica", 10);
        Nota nota2 = new Nota("Istorie", 9);

        System.out.println(nota1);
        System.out.println(nota2);
    }
}
