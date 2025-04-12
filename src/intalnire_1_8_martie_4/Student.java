package intalnire_1_8_martie_4;
import java.util.ArrayList;
import java.util.Collections;

public class Student {
    int cod;
    String nume;
    ArrayList<Nota> note;

    //constructor fara parametri
    public Student() {
        this.cod = 0;
        this.nume = "";
        this.note = new ArrayList<>();
    }

    //constructor cu un paramtru
    public Student (int cod) {
        this.cod = cod;
        this.nume = "";
        this.note = new ArrayList<>();
    }

    //constructor cu doi parametri
    public Student (int cod, String nume) {
        this.cod = cod;
        this.nume = nume;
        this.note = new ArrayList<>();
    }

    //constructor cu trei parametri
    public Student (int cod, String nume, ArrayList<Nota> note) {
        this.cod = cod;
        this.nume = nume;
        this.note = note;
    }

    public int getCod() {
        return this.cod;
    }

    public String getNume() {
        return this.nume;
    }

    public Student setCod(int cod) {
        this.cod = cod;
        return this;
    }

    public Student setNume(String nume) {
        this.nume = nume;
        return this;
    }

    public void adaugaNota(Nota notaNoua) {
        ////varianta pentru clasa Nota cand nu este imutabila
        //for (Nota notaExistenta : note) {
        //    if (notaExistenta.getDenumire().equals(notaNoua.getDenumire())) {
        //        notaExistenta.setValoare(notaNoua.getValoare());
        //        return;
        //    }
        //}

        //varianta pentru clasa Nota cand este imutabila
        for (int i = 0; i < note.size(); i++){ //for each index i from 0 up to the number of notes
            Nota notaExistenta = note.get(i); //get the note at position i and call it notaExistenta
            if (notaExistenta.getDenumire().equals(notaNoua.getDenumire())){ //if the denumire of the existing note is equal to the denumire of the new note
                note.set(i, notaNoua); //then replace the existing note at position i with the new note (notaNoua)
                return; //stop here — we’ve found and updated the note.Stop here — we’ve found and updated the note.
            }
        }
        note.add(notaNoua); //if no matching subject is found after going through all the notes
        //then add the new note at the end of the list (because it's a new subject for this student)
    }

    public ArrayList<Nota> getNote() {
        return this.note;
    }

    @Override public String toString() {
        ArrayList<Nota> noteSortate = new ArrayList<>(note);
        Collections.sort(noteSortate);
        //noteSortate.sort(null); //sort using Comparable
        //return "cod: " + cod + "; nume: " + nume + "; note: " + note;
        return "cod: " + cod + "; nume: " + nume + "; note: " + noteSortate;
    }
}
