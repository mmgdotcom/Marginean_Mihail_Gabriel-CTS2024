package Strategy;

import java.util.ArrayList;

public class StrategieCaloriiMinim implements IProcesabil {
    @Override
    public OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri) {
        OfertaMeniu ofertaMeniuCaloriiMinime = listaMeniuri.get(0); //consider ca primul este cel mai bun
        for (OfertaMeniu oferta: listaMeniuri) { //parcurg lista
            if (oferta.getNrCalorii() < ofertaMeniuCaloriiMinime.getNrCalorii()) //daca gasesc o oferta care are numarul de calorii
                // mai mic decat cea mai buna oferta din cele considerate
                ofertaMeniuCaloriiMinime = oferta; //atunci actualizez
        }
        return ofertaMeniuCaloriiMinime; //ulterior returnez obiectul respectiv
    }
}
