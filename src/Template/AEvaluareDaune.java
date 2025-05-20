package Template;

public abstract class AEvaluareDaune {
    //pasul identificareDauna() este acelasi indiferent de tipul daunei
    //daca este acelasi inseamna ca indiferent de situatie este acelasi comportament
    //adica are implementare concreta => nu mai este abstract ci punem final
    final void identificareDauna(){
        System.out.println("S-a facut o evaluare initiala a daunei! (PAS FIX)");
    }
    abstract void evaluareInitialaDauna();
    abstract void trimitereEvaluareManager();

    //defineste pasii de urmat in cazul unei daune
    public final void proceduraEvaluareDaune(){
        identificareDauna();
        evaluareInitialaDauna();
        trimitereEvaluareManager();
    }
}
