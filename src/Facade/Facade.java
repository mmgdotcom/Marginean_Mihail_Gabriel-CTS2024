package Facade;

public class Facade {
    private ColectieBucatari colectieBucatari = new ColectieBucatari();
    private ColectieOspatari colectieOspatari = new ColectieOspatari();

    public void addBucatar(Bucatar bucatar) {
        colectieBucatari.addBucatar(bucatar);
    }

    public void addOspatar(Ospatar ospatar) {
        colectieOspatari.addOspatar(ospatar);
    }

    public boolean verificaDisponibilitateData(String data, int nrPersoane) {
        //presupn ca preiau disponibilitatea bucatarilor si ospatarilor dupa data
        int contorBucatari = colectieBucatari.getNumarBucatariLiberiData(data);
        int contorOspatari = colectieOspatari.getNrOspatariLiberiData(data);
        if (contorOspatari >= nrPersoane / 5 && contorBucatari >= nrPersoane / 20) {
            return true;
        }
        return false;
    }
}
