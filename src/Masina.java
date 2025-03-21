public class Masina extends Vehicul {

    private String proprietar;
    private String marca;


    public Masina(int anFabricare, String producator, double putereMotor, String proprietar, String marca) {
        super(anFabricare, producator, putereMotor);
        this.proprietar = proprietar;
        this.marca = marca;
    }

    public String getProprietar() {
        return proprietar;
    }

    public void setProprietar(String proprietar) {
        this.proprietar = proprietar;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void start() {
        System.out.println(("Masina " + getMarca() + " a fost pornita"));

    }

    @Override
    public String toString() {
        return "Masina{" +
                "proprietar='" + proprietar + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
