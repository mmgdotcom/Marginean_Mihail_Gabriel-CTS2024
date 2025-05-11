package Decorator;

public class Program {
    public static void main(String[] args) {

        //ianinte de Decorator
        //construiesc un obiect de tip pizza
        //afisez componentele si pretul
        APizza pizza = new PizzaVegetariana();
        System.out.println("Inainte de decorator");
        System.out.println("Pizza: " + pizza.getComponente());
        System.out.println("Pret: " + pizza.getPret());
        System.out.println("\n");

        //dupa folosirea Decorator
        //nu inseamna ca nu se pot genera si pizza "simpla" precum inainte
        //sa avem grija sa indeplinim DIP (Dependency Inversion Principle)
        APizza pizzaDecorata = new DecoratorCrown(pizza);
        //declar clasa abstracta APizza pentru ca toate celelalte deriva din respectiva clasa
        //spun ca pizzaDecorata reprezinta apeland constructorul clasei concrete DecoratroCrown
        //si trimitem ca parametru un obiect de tip pizza
        //=> pizza decorata este un DecoratroCrown peste pizza pe care am facut-o mai devreme:
        //"APizza pizza = new PizzaVegetariana();"
        System.out.println("Dupa decorator");
        System.out.println("Pizza: " + pizzaDecorata.getComponente());
        System.out.println("Pret: " + pizzaDecorata.getPret());
        System.out.println("\n");

        //decorare multipla
        System.out.println("Decorare multipla");
        APizza pizzaDecorataMultiplu = new DecoratorPicant //vreau o pizzaDecorataMultiplu de forma DecoratorPicant
                (new DecoratorCrown //peste un DecoratorCrown
                        (new PizzaVegetariana()), 10); //peste o PizzaVegetariana si nivelul de iuteala 10
        System.out.println("Pizza: " + pizzaDecorataMultiplu.getComponente());
        System.out.println("Pret: " + pizzaDecorataMultiplu.getPret());
    }
}
