public class Decoratiune {
    private String material;

    public Decoratiune(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    @Override
    public String toString() {
        return "Decoratiune{" + "material='" + material + '\'' + '}';
    }
}
