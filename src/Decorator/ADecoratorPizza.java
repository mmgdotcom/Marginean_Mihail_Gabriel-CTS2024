package Decorator;

//greseala de implementare daca NU avem si clasa abstracta decorator
//este nevoie de aceasta clasa tocmai pentru a oferi posibilitatea ca
//alte clasede decoratori concreti sa extinda aceasta clasa si daca
//exista functionalitati comune acestea sa fie inghitite de aceasta
//clasa abstracta urmand ca decoratorii concreti sa se ocupe strict
//de ce aduc ei plus valoare, modificare in cod
public abstract class ADecoratorPizza extends APizza{
    protected APizza pizza; //obiectul pe care il decoreaza

    public ADecoratorPizza(APizza pizza) {
        //constructor care sa primeasca param obiectul pe care il decoreaza
        super();
        this.pizza = pizza;
    }

    //in decoratorul abstract, meth abstracte se
    //comporta identic precum obj pe care il decoreaza
    @Override
    String getComponente() {
        return pizza.getComponente();
    }

    @Override
    int getPret() {
        return pizza.getPret();
    }
}
