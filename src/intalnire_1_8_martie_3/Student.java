package intalnire_1_8_martie_3;

import java.util.ArrayList;

public class Student {
    int cod;
    String nume;
    ArrayList<Nota> note;

    public Student() {
        this.cod = 0;
        this.nume = "";
        this.note = new ArrayList<>();
    }

    public Student(int newCod) {
        this.cod = newCod;
        this.nume = "";
        this.note = null;
    }

    public Student(int newCod, String newNume) {
        this.cod = newCod;
        this.nume = newNume;
        this.note = null;
    }

    public Student(int newCod, String newNume, ArrayList<Nota> newNote) {
        this.cod = newCod;
        this.nume = newNume;
        this.note = newNote;
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int newCod) {
        this.cod = newCod;
    }

    public String getNume() {
        return this.nume;
    }

    public void setNume(String newNume) {
        this.nume = newNume;
    }

    public ArrayList<Nota> getNote() {
        return this.note;
    }

    //public void adaugaNota(Nota notaNoua) {
    //    for (Nota notaExistenta : note) { //pentru fiecare notaExistenta de tip Nota care exista in lista note executa urmatoarele
    //        if (notaExistenta.getDenumire().equals(notaNoua.getDenumire())) {
    //            notaExistenta.setValoare(notaNoua.getValoare());
    //        }
    //    }
    //    note.add(notaNoua);
    //}

    public void adaugaNota(Nota notaNoua) {
        //metoda adaugaNota() care primeste parametrul notaNoua LOGIC ! ! ! Dooooh
        //ce vrem sa obtinem? Sa adaugam o nota pe care sa o comparam cu o notaExistenta
        //=> pentru fiecare notaExistenta de tipul Nota din lista note executa urmatoarele
        //daca nota exista atunci trebuie modificata nota existenta
        for (Nota notaExistenta : note) {
            if (notaNoua.getDenumire().equals(notaExistenta.getDenumire())){
                notaExistenta.setValoare(notaNoua.getValoare());
                return; //sa evit sa adauge de doua ori ! ! ! Doooooh ! ! !
            }
        }
        note.add(notaNoua);
    }

    @Override public String toString() {
        return "cod: " + cod + "nume: " + nume + "note: " + note;
    }
}
