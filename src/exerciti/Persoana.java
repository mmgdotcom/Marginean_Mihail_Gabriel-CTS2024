package exerciti;

public class Persoana {
    private String nume;
    Persoana(String nume) { this.nume = nume; }
    @Override public String toString() { return nume; }
}

class Angajat extends Persoana {
    private String departament;
    public Angajat(String nume, String departament) {
        super(nume);
        this.departament = departament;
    }
    @Override public String toString() { return departament; }

    public static void main(String[] args) {
        Persoana p = new Angajat("Ionescu Dan", "IT");
        System.out.println(p);
    }
}

