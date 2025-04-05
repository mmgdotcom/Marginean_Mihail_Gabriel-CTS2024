package intalnire_1_8_martie_2;

import java.util.ArrayList;

public class Student {
    int cod;
    String nume;
    ArrayList<Nota> note;

    public Student() {
        this.cod = 0;
        this.nume = "Unknown";
        this.note = new ArrayList<Nota>();
    }

    public Student(int cod) {
        this.cod = cod;
        this.nume = "Unknown";
        this.note = new ArrayList<>();
    }

    public Student(int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
        this.note = new ArrayList<>();
    }

    public Student(int cod, String nume, ArrayList<Nota> note) {
        this.cod = cod;
        this.nume = nume;
        this.note = new ArrayList<>(note);
    }

    public int getCod() {
        return cod;
    }

    public String getNume() {
        return nume;
    }

    public ArrayList<Nota> getNote() {
        return note;
    }

    public void setCod(int newCode) {
        this.cod = newCode;
    }

    public void setNume(String newNume) {
        this.nume = newNume;
    }

    public void setNote(ArrayList<Nota> newNote) {
        this.note = newNote;
    }

    public void adaugaNota(Nota notaNoua) {
        for (Nota notaExistenta : note) { //pentru fiecare notaExistenta de tip Nota care exista in lista note executa urmatoarele
            if (notaExistenta.getDenumire().equals(notaNoua.getDenumire())) {
                notaExistenta.setValoare(notaNoua.getValoare());
                return;
            }
        }
        note.add(notaNoua);
    }

    @Override public String toString() {
        return "cod: " + cod + "; nume: " + nume + "; note: " + note;
    }

}
