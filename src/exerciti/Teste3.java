package exerciti;

import java.util.*;

class Persoana1 {
    int cod;
    String nume;

    public Persoana1(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persoana1 persoana = (Persoana1) o;
        return cod == persoana.cod;
    }

    public int hashCode() {
        return Objects.hash(cod);
    }
}

class Teste3 {
    public static void main(String[] args) {
        var maria = new Persoana1(1, "Maria");
        var ion = new Persoana1(2, "Ion");
        var altIon = new Persoana1(2, "Ion");
        var vasile = new Persoana1(3, "Vasile");

        Set<Persoana1> lista = new HashSet<>(Arrays.asList(altIon, ion, maria, vasile));
        System.out.println(lista.size());
    }
}

