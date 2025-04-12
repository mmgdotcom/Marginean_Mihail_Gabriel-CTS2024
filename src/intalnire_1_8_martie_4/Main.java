package intalnire_1_8_martie_4;

public class Main {
    public static void main(String[] args) {
        Student s = new Student(101, "Ion Popescu");

        s.adaugaNota(new Nota("Informatica", 10));
        s.adaugaNota(new Nota("Matematica", 9));
        s.adaugaNota(new Nota("Fizica", 8));
        s.adaugaNota(new Nota("Matematica", 10));

        System.out.println(s);
    }
}
