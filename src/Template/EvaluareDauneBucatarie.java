package Template;

public class EvaluareDauneBucatarie extends AEvaluareDaune{
    //@Override
    //void identificareDauna() {System.out.println("Identificare dauna bucatarie")}

    @Override
    void evaluareInitialaDauna() {
        System.out.println("Evaluare initiala daune bucatarie");
    }

    @Override
    void trimitereEvaluareManager() {
        System.out.println("Trimitere evaluare daune bucatarie spre manager");
    }
}
