package Facade;

public class Ospatar {
    private String nume;
    private boolean esteOcupat;

    public Ospatar(String nume, boolean esteOcupat) {
        this.nume = nume;
        this.esteOcupat = esteOcupat;
    }

    public String getNume() {
        return nume;
    }

    public boolean isEsteOcupat() {
        return esteOcupat;
    }
}
