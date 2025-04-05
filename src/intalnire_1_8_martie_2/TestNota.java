package intalnire_1_8_martie_2;

public class TestNota {
    public static void main(String[] args) {
        //creez doua obiecte de tip Nota
        Nota notaExistenta = new Nota("Matematica", 9);
        Nota notaNoua = new Nota("Matematica", 7);

        //printez denumire si valoare aferente
        System.out.println("notaExistenta.getDenumire(): " + notaExistenta.getDenumire());
        System.out.println("noutaNoua.getDenumire(): " + notaNoua.getDenumire());
        System.out.println("notaExistenta.getValoare: " + notaExistenta.getValoare());
        System.out.println("notaNoua.getValore(): " + notaNoua.getValoare());

        //compar denumire
        boolean sameSubject = notaExistenta.getDenumire().equals(notaNoua.getDenumire());
        System.out.println("Are the student name the same? " + sameSubject);

        //daca materia este acelasi atunci fac update
        if (sameSubject) {
            System.out.println("Updating notaExistenta's valoare...");
            notaExistenta.setValoare(notaNoua.getValoare());
        }

        //afisez notaExistenta actualizata
        System.out.println("Updated notaExistenta: " + notaExistenta);
    }
}
