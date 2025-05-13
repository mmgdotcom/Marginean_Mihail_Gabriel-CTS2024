package Adapter.obiecte;

import Adapter.RestaurantA.IEvaluareClientFirmaA;
import Adapter.RestaurantB.Client;
import Adapter.RestaurantB.IEvaluareClientFirmaB;

public class AdaptorEvaloareClient_Obiect implements IEvaluareClientFirmaB {
    private IEvaluareClientFirmaA evaluareClientFirmaA;

    public AdaptorEvaloareClient_Obiect(IEvaluareClientFirmaA evaluareClientFirmaA) {
        this.evaluareClientFirmaA = evaluareClientFirmaA;
    }

    //metoda folosita pentru pregatire input pentru evaluare client firma A
    private int costTotalEvenimente(Client client) {
        System.out.println("Transformare input din client in float (total)");
        int costTotalEvenimente = 0;
        for (int i = 0; i < client.getNrEvenimente(); i++)
            costTotalEvenimente += client.getCostEvenimente()[i];
        return costTotalEvenimente;
    }

    @Override
    public void analizaClientFirmaB(Client client) {
        System.out.println("Pare ca ar face B-ul analiza clientului dar...");
        this.evaluareClientFirmaA.analizaClientFirmaA(costTotalEvenimente(client));
    }
}
