package Strategy;

import java.util.ArrayList;

//clasa Context/Obiect din diagramele GoF
public class MeniuRestaurant {
    private ArrayList<OfertaMeniu> listaMeniuri = new ArrayList<>();
    private IProcesabil strategieAlegere; //referinta strategiei curente

    public void addOfertaMeniu(OfertaMeniu ofertaMeniu) {
        this.listaMeniuri.add(ofertaMeniu);
    }

    //meth care permite schimbarea strategiei
    public void setStrategieAlegere(IProcesabil strategieAlegere) {this.strategieAlegere = strategieAlegere;}

    //meth care pe baza strategiei curente rezolva cerinta principala
    //adica alegerea unui meniu
    public OfertaMeniu alegereOferta() {
        if (strategieAlegere != null) { //daca am o strategie atasata
            return strategieAlegere.alegereMeniu(listaMeniuri); //alegerea unui meniu (OfertaMeniu) se realizeaza tinand cont
            //de strategia curenta strategieAlegere apeland metoda respectiva (adica alegereMeniu)
        } else throw new UnsupportedOperationException();
    }
}

