package Adapter;

import Adapter.RestaurantA.EvaluareClientFirmaA;
import Adapter.RestaurantA.IEvaluareClientFirmaA;
import Adapter.RestaurantB.Client;
import Adapter.RestaurantB.EvaluareClientFirmaB;
import Adapter.RestaurantB.IEvaluareClientFirmaB;
import Adapter.clase.AdaptorEvaluareClient_Clase;
import Adapter.obiecte.AdaptorEvaloareClient_Obiect;

public class Program {

    public static void main(String[] args){
        //RESTAURANT A
        System.out.println("......ce se intampla in restaurant A......");
        IEvaluareClientFirmaA evA = new EvaluareClientFirmaA();
        evA.analizaClientFirmaA(1200);

        //RESTAURANT B
        System.out.println("......ce se intampla in restaurant B......");
        int[] costEvenimente = new int[]{1000, 2000, 20300, 1000, 5000};
        Client client = new Client("XYZ", 5, costEvenimente);
        IEvaluareClientFirmaB evB = new EvaluareClientFirmaB();
        evB.analizaClientFirmaB(client);


        //IN ACEST PUNCT RESTAURANTUL B A FOST CUMPARAT DE RESTAURANTUL A
        //TREBUIE ADAUGAT UN BRIDGE/CONEXIUNE/ADAPTER INTRE CELE DOUA FRAMEWORK-URI

        //folosind adapte pe clase
        System.out.println("......ce se intampla in restaurant B dupa ce a fost cumparat......");
        int[] costEvenimente2 = new int[]{1000, 2000, 20300, 1000, 5000};
        Client client2 = new Client("XYZ", 5, costEvenimente2);
        IEvaluareClientFirmaB evB2 = new AdaptorEvaluareClient_Clase();
        evB2.analizaClientFirmaB(client2);

        //folosind adapter pe obiecte
        System.out.println("......ce se intampla in restaurant B dupa ce a fost cumparat......");
        int[] costEvenimente3 = new int[]{1000, 2000, 20300, 1000, 5000};
        Client client3 = new Client("XYZ", 5, costEvenimente3);
        IEvaluareClientFirmaB evB3 = new AdaptorEvaloareClient_Obiect(new EvaluareClientFirmaA());
        evB3.analizaClientFirmaB(client3);
    }
}
