package intalnire_1_8_martie_4;

//How do we make a class immutable in Java?
//Here are the exact steps:
//Make all fields private and final
//Remove all setters
//Initialize all fields through constructor(s)
//Do not allow subclasses to override behavior (optional but recommended — make class final)
//Provide only getters

final public class Nota implements Comparable<Nota>{
    private final String denumire;
    private final int valoare;

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

    @Override public int compareTo(Nota altaNota) {
        //return this.denumire.compareToIgnoreCase(altaNota.denumire);
        return this.denumire.compareTo(altaNota.denumire);
    }

    @Override public String toString() {
        return "denumire: " + denumire + "; valoare: " + valoare;
    }

}
