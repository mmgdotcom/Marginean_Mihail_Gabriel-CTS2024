package Strategy;

import java.util.ArrayList;

//IProcesabil = posibilitatea ca ceva sa fie procesabil
public interface IProcesabil {
    //meth s. n. alegereMeniu
    //aleg, aleg dar de unde?
    //din parametrul listaMeniuri care foloseste clasa OfertaMeniu si pe baza alegerii concrete din meniu
    //cu clasele mele concrete fac un meniu din OfertaMeniu
    OfertaMeniu alegereMeniu(ArrayList<OfertaMeniu> listaMeniuri);
}

