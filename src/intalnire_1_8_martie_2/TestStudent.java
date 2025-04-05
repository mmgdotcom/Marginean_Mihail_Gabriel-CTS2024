package intalnire_1_8_martie_2;

import intalnire_1_8_martie_2.Student;
import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        //creez un student
        Student student = new Student(1, "Ana");

        //creez trei obiecte de tip Nota
        Nota notaMate = new Nota("Matematica", 9);
        Nota notaInfo = new Nota("Informatioca", 10);
        Nota notaMateNoua = new Nota("Matematica", 7);

        //adaug notele studentului
        student.adaugaNota(notaMate);
        student.adaugaNota(notaInfo);
        student.adaugaNota(notaMateNoua);

        //afisez detaliile studentului
        System.out.println(student);
    }
}
