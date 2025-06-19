package tema3_exemplu_subiect_examen.src;

public class Disciplina {
    private int id;
    private String denumire;
    private String tip;

    public Disciplina(int id, String denumire, String tip) {
        this.id = id;
        this.denumire = denumire;
        this.tip = tip;
    }

    public int getId() {
        return id;
    }

    public String getDenumire() {
        return denumire;
    }

    public String getTip() {
        return tip;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", denumire='" + denumire + '\'' + ", tip='" + tip + '\'' + '}';
    }
}
