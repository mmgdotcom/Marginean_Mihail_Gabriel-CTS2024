package Adapter.clase;

import Adapter.RestaurantA.EvaluareClientFirmaA;
import Adapter.RestaurantB.Client;
import Adapter.RestaurantB.IEvaluareClientFirmaB;

//este Adapter pe clase ca nu detine niciun obiect
//CE ESTE EXTENDS INSEAMNA CA SE COMPORTA CA CE EXTINDE
//CAND ZIC IMPLEMENTS INSEAMNA CA ARATA PRECUM CEA CE IMPLEMENTS
public class AdaptorEvaluareClient_Clase extends EvaluareClientFirmaA implements IEvaluareClientFirmaB {
    private int costTotalEvenimente(Client client) {
        System.out.println("Transformare input din client in float (total)");
        int costTotalEvenimente = 0;
        for (int i = 0; i < client.getNrEvenimente(); i++)
            costTotalEvenimente += client.getCostEvenimente()[i];
        return costTotalEvenimente;
    }

    //@OVERRIDE SE CERE PENTRU CA AM ZIS CA IMPLEMENTS
    @Override
    public void analizaClientFirmaB(Client client){
        System.out.println("Pare ca ar face B-ul analiza clientului dar...");
        //deleg responsabilitatea firmei A sa se ocupe de evaluarea clientului
        this.analizaClientFirmaA(costTotalEvenimente(client));
        //cand zic this. este din cauza ca am extend => am preluat comportamentul concret
        //din clasa valuareClientFirmaA doar ca firma A avea nevoie de un total nu de un client
        //ce are la dispozitie firma B. Pentru asta s-a implementat o functie ajutatoare de
        //transformare (costTotalEvenimente);
    }
}

