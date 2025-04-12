package intalnire_1_8_martie_4;
import java.util.ArrayList;

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
        for (Nota notaExistenta : note) {
            if (notaExistenta.getDenumire().equals(notaNoua.getDenumire())) {
                notaExistenta.setValoare(notaNoua.getValoare());
                return;
            }
        }
        note.add(notaNoua);
    }

    public ArrayList<Nota> getNote() {
        return this.note;
    }

    @Override public String toString() {
        return "cod: " + cod + "; nume: " + nume + "; note: " + note;
    }
}
