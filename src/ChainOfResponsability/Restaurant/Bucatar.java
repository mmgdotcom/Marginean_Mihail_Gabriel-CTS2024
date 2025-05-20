package ChainOfResponsability.Restaurant;

public class Bucatar extends AHandler{
    @Override
    void procesareComanda(Comanda comanda) {
        if (comanda.getGrad() > 5 && comanda.getGrad() <= 100) { //este comanda de grad mai mare ca 5 dar mai mic de 100?
            System.out.println("Bucatarul a procesat comanda " + comanda.getProdus()); //bucatarul poate sa proceseze comanda
        } else if (comanda.getGrad() <= 5) { //daca gradul comenzii e <5
            System.out.println("Nu trebuia sa ajunga aici!"); //spunem ca nu trebuia sa ajunga aici
        } else if (this.getNextHandler() != null) { //daca nu, inseamna ca este mai mare decat 100 si verific daca exista urmatorul responsabil
            System.out.println("Bucatarul nu poate procesa comanda"); //deci nici macar bucatarul nu o poate procesa
            this.getNextHandler().procesareComanda(comanda); //si o trimit urmatorului responsabil
        } else {
            System.out.println("Inca nu exista un responsabil pentru asta"); //daca nu, ii spun ca nu exist niciun responsabil pentru comanda
        }
    }
}
