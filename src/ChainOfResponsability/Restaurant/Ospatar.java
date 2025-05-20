package ChainOfResponsability.Restaurant;

public class Ospatar extends AHandler { //ospatarul extinde clasa abstracta
    @Override
    void procesareComanda(Comanda comanda) {
        if (comanda.getGrad() <= 5) //daca comanda are un grad <= 5
            System.out.println("Osaptarul a procesat comanda" + comanda.getProdus()); //ospatarul poate sa proceseze comanda
        else { //daca ospatarul nu poate procesa comanda
            System.out.println("Ospatarul nu poate procesa comanda"); //ii spunem ca nu este de competenta lui
            if (this.getNextHandler() != null) // verificam daca are un responsabil dupa el
                this.getNextHandler().procesareComanda(comanda); //si punem responsabilul sa proceseze comanda
        }
    }
}
