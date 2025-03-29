package array_list;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars =new ArrayList<String>();
        Scanner masina = new Scanner(System.in);
        //Scanner nrMarci = new Scanner(System.in);

        System.out.println("Inserati numarul de marci pe care doriti sa il introduceti: ");
        int nrMarci = Integer.parseInt(masina.nextLine());
        //int nrMarci = masina.nextInt();
        //masina.nextLine(); //consuma \n de la nextInt() ca altfel il asigneaza automat primei masini din bucla
        //si apare ca empty string

        for (int i = 0; i < nrMarci; i++) {
            System.out.println("Adaugati o marca de masina: ");
            String marca = masina.nextLine();
            cars.add(marca);
        }
        Collections.sort(cars); //sort first, then display
        System.out.println("Marcile de masina adaugate sunt: " + cars);
        System.out.println("Doriti sa adaugati o marca de masina noua? (y/n)");
        String yn = masina.nextLine();
        System.out.println("Raspunsul dumneavoastra este: " + (Objects.equals(yn, "y") ? "yes" : "no"));
        if (Objects.equals(yn, "y")) {
            System.out.println("Pe ce pozitie doriti sa adaugati noua marca de masina?");
                int poz = Integer.parseInt(masina.nextLine());
            System.out.println("Adaugati o marca de masina: ");
            String marca = masina.nextLine();
            cars.add(poz, marca);
            System.out.println("Marcile de masina adaugate sunt: " + cars);
        } else {
            System.out.println("Ati ales sa nu mai adaugati nicio marca de masina!");
        }
    }
}
