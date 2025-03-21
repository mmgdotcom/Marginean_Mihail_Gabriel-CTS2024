public abstract class Vehicul {

    private int anFabricare;
    private String producator;
    private double  putereMotor;

    public Vehicul(int anFabricare, String producator, double putereMotor) {
        this.anFabricare = anFabricare;
        this.producator = producator;
        this.putereMotor = putereMotor;
    }

    public Vehicul(int anFabricare, String producator) {
        this.anFabricare = anFabricare;
        this.producator = producator;
        this.putereMotor = 0;
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "anFabricare=" + anFabricare +
                ", producator='" + producator + '\'' +
                ", putereMotor=" + putereMotor +
                '}';
    }

    public abstract void start();
}
