package Decorator;

//clasa ProdusConcret din digrama
//@override pe cele doua metode
//am hardcodat componentele si pretul
public class PizzaVegetariana extends APizza {
    @Override
    String getComponente() {
        return "blat, sos rosii, ciuperci, ceapaa";
    }

    @Override
    int getPret() {
        return 27;
    }
}
