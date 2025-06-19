package tema3_exemplu_subiect_examen.src;

public class Programare {
    private String zi, interval, sala, tip, formatie;
    private int idDisciplina;

    public Programare(String zi, String interval, String sala, String tip, String formatie, int idDisciplina) {
        this.zi = zi;
        this.interval = interval;
        this.sala = sala;
        this.tip = tip;
        this.formatie = formatie;
        this.idDisciplina = idDisciplina;
    }

    public String getZi() {
        return zi;
    }

    public String getInterval() {
        return interval;
    }

    public String getSala() {
        return sala;
    }

    public String getFormatie() {
        return formatie;
    }

    public int getidDisciplina() {
        return idDisciplina;
    }

    @Override
    public String toString() {
        return "Programare{" +
                "zi='" + zi + '\'' +
                ", interval='" + interval + '\'' +
                ", sala='" + sala + '\'' +
                ", disciplina=" + idDisciplina +
                ", formatie='" + formatie + '\'' +
                '}';
    }
}
