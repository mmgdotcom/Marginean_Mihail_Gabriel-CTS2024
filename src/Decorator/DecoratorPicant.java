package Decorator;

//alta clasa de tip Decorator concret din diagrama
public class DecoratorPicant extends ADecoratorPizza {
    private int nivelIuteala;

    public DecoratorPicant(APizza pizza, int nivelIuteala) {
        super(pizza);
        this.nivelIuteala = nivelIuteala;
    }

    @Override
    String getComponente() {
        return super.getComponente() + ", iuteala " + this.nivelIuteala;
    }

    @Override
    int getPret() {
        return super.getPret() + 7;
    }
}
