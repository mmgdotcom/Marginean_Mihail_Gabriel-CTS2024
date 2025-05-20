package ChainOfResponsability.Restaurant;

public class Program {
    public static void main(String[] args) {

        //creez responsabili
        Ospatar ospatar = new Ospatar();
        Bucatar bucatar = new Bucatar();
        BucatarSef bucatarSef = new BucatarSef();

        //setez urmatorul responsabil
        ospatar.setNextHandler(bucatar);
        bucatar.setNextHandler(bucatarSef);

        //fac comenzi
        Comanda comanda1 = new Comanda("Pizza", 2, 15);
        Comanda comanda2 = new Comanda("Bautura", 1, 3);
        Comanda comanda3 = new Comanda("Cafea", 1, 4);

        //lansez comenzi
        System.out.println("Comanda 1");
        ospatar.procesareComanda(comanda1);

        System.out.println("\nComanda 2");
        ospatar.procesareComanda(comanda2);

        System.out.println("\nComanda 3");
        ospatar.procesareComanda(comanda3);

        //stil romanesc
        System.out.println("\nComanda 3 ROMANESC");
        bucatar.procesareComanda(comanda3);
    }
}
