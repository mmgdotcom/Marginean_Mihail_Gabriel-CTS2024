package ChainOfResponsability.Restaurant;

public abstract class AHandler { //clasa abstracta Handler
    private AHandler nextHandler; //avem un nextHandler

    public AHandler getNextHandler() {return this.nextHandler;} //ca sa pot sa preiau nextHandler

    public void setNextHandler (AHandler nextHandler) {this.nextHandler = nextHandler;} //am setter ca sa pot sa creez lantul

    abstract void procesareComanda(Comanda comanda); //meth abstracta procesareComanda care primeste o comanda
}
