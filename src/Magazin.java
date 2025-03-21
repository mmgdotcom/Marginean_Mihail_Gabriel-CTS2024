import exceptii.ExceptieNrIntrariInsuficiente;
import exceptii.ExceptiePodeaMoaleDecorSticla;

import java.util.ArrayList;
import java.util.List;

public class Magazin {
    private String denumire;
    private float suprafata;
    private int nrIntrari;
    private Podea podea;
    private List<Decoratiune> decoratiuni;

    private Magazin(String denumire, float suprafata, int nrIntrari, Podea podea, List<Decoratiune> decoratiuni) {
        this.denumire = denumire;
        this.suprafata = suprafata;
        this.nrIntrari = nrIntrari;
        this.podea = podea;
        this.decoratiuni = decoratiuni;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getSuprafata() {
        return suprafata;
    }

    public int getNrIntrari() {
        return nrIntrari;
    }

    public Podea getPodea() {
        return podea;
    }

    public List<Decoratiune> getDecoratiuni() {
        return decoratiuni;
    }

    //@Override
    //public String toString() {
    //    return "Magazin{" + "denumire='" + denumire + '\'' + ", suprafata=" + suprafata + ", nrIntrari=" + nrIntrari +
    //            ", podea='" + podea + '\'' + ", decoratiuni='" + decoratiuni + '\'' + '}';
    //}


    @Override
    public String toString() {
        return "Magazin{" +
                "denumire='" + denumire + '\'' +
                ", suprafata=" + suprafata +
                ", nrIntrari=" + nrIntrari +
                ", podea=" + (podea != null ? podea.toString() : "Standard") +
                ", decoratiuni=" + decoratiuni +
                '}';
    }

    //inner static builder
    public static class MagazinBuilder {
        private String denumire;
        private float suprafata;
        private int nrIntrari = 1;
        private Podea podea = null;
        private List<Decoratiune> decoratiuni = new ArrayList<>();

        public MagazinBuilder withDenumire(String denumire) {
            this.denumire = denumire;
            return this;
        }

        public MagazinBuilder withSuprafata(float suprafata) {
            this.suprafata = suprafata;
            return this;
        }

        public MagazinBuilder withNrIntrari(int nrIntrari) {
            this.nrIntrari = nrIntrari;
            return this;
        }

        public MagazinBuilder withPodea(Podea podea) {
            this.podea = podea;
            return this;
        }

        public MagazinBuilder withDecoratiuni(List<Decoratiune> decoratiuni) {
            this.decoratiuni.addAll(decoratiuni);
            return this;
        }

        public Magazin build() throws ExceptieNrIntrariInsuficiente, ExceptiePodeaMoaleDecorSticla {
            //validare nr intrari per suprafata
            int minIntrari = (int) Math.ceil(suprafata/100);
            if (nrIntrari < minIntrari) {
                throw new ExceptieNrIntrariInsuficiente("Număr insuficient de intrări: minim " + minIntrari + " pentru suprafața " + suprafata + "mp.");
            }

            //validare: podea moale + decoratiune din sticla
            if (podea != null && podea.getDuritate() < 2) {
                for (Decoratiune d : decoratiuni) {
                    if ("Sticla".equalsIgnoreCase(d.getMaterial())) {
                        throw new ExceptiePodeaMoaleDecorSticla("Podea moale (<2) nu permite decoratiuni din sticla.");
                    }
                }
            }

            return new Magazin(denumire, suprafata, nrIntrari, podea, decoratiuni);
        }
    }

}
