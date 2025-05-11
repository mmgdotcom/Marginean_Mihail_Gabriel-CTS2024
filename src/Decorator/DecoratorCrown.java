package Decorator;

//clasa decorator concret din diagrama
public class DecoratorCrown extends ADecoratorPizza{

    //obligatoriu venim cu constructorul clasei care se genereaza automat
    public DecoratorCrown(APizza pizza) {
        super(pizza); //apeleaza constructorul din clasa abstracta pe care o deriveaza
    }

    //se cere explicit @Override pe meth din clasa abstracta de baza
    //pentru a le suplimenta in functie de logica decoratorului concret
    //pentru ca in clasa adstracta ADecoratorPizza deja am facut @Override
    //pe acele metode => acele metode nu mai sunt abstracte
    //=> faptul ca sunt in clasa concreta DecoratorCrown si ca extinf o
    //clasa abstracta care nu mai are metode abstracte
    //=> automat nu se mai cer implementarile acelor metode abstracte
    //insa cer explicit @Override pe acele metode pe care decoratorul meu
    //le afecteaza
    @Override String getComponente() {
        return super.getComponente() + ", margine cu branza";
    }

    @Override
    int getPret() {
        //TO DO Auto-generated method stub
        return super.getPret() + 10;
    }
}
