package Facade.program;

import Facade.*;

public class Program {
    public static void main(String[] args) {

        ColectieBucatari colectieBucatari = new ColectieBucatari();
        colectieBucatari.addBucatar(new Bucatar("Gigel1", true)); //populare date
        colectieBucatari.addBucatar(new Bucatar("Gigel2", false)); //populare date
        colectieBucatari.addBucatar(new Bucatar("Gigel3", false)); //populare date
        colectieBucatari.addBucatar(new Bucatar("Gigel4", true)); //populare date

        ColectieOspatari colectieOspatari = new ColectieOspatari();
        colectieOspatari.addOspatar(new Ospatar("Costel1", true)); //populare date
        colectieOspatari.addOspatar(new Ospatar("Costel2", false)); //populare date
        colectieOspatari.addOspatar(new Ospatar("Costel3", false)); //populare date
        colectieOspatari.addOspatar(new Ospatar("Costel4", true)); //populare date

        //fara Facade
        //clientul cauta daca e okay data de "12/12/2020"
        String data = "12/12/2020";
        int nrPersoanePetrecere = 100;
        int contorBucatari = colectieBucatari.getNumarBucatariLiberiData(data);
        int contorOspatari = colectieOspatari.getNrOspatariLiberiData(data);
        if(contorOspatari >= nrPersoanePetrecere / 5 && contorBucatari >= nrPersoanePetrecere/20) {
            System.out.println("Se poate tine petrecerea atunci");
        } else {
            System.out.println("NU se poate tine petrecerea atunci");
        }

        //cu Facade
        Facade  facade = new Facade();
        facade.addBucatar(new Bucatar("Gigel1", true)); //populare date
        facade.addBucatar(new Bucatar("Gigel2", true)); //populare date
        facade.addBucatar(new Bucatar("Gigel3", false)); //populare date
        facade.addBucatar(new Bucatar("Gigel4", true)); //populare date
        facade.addBucatar(new Bucatar("Gigel5", true)); //populare date
        facade.addOspatar(new Ospatar("Costel1", true)); //populare date
        System.out.println(facade.verificaDisponibilitateData("12/12/2020", 100));
    }
}
