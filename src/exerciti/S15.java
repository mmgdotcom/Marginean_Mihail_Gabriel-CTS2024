package exerciti;

class ClasaAB {
    public void print() {
        System.out.println("ClasaA");
    }
}

class ClasaB extends ClasaAB {
    @Override
    public void print() {
        System.out.println("ClasaB");
    }
}

public class S15 {
    public static void main(String[] args) {
        //ClasaB obj = (ClasaB) new ClasaAB(); // 👈 Casting here //asa da eroare ca clasa B este derivata
        ClasaAB obj = (ClasaAB) new ClasaB(); // 👈 Casting here //asa merge pentru ca AB e superclasa
        obj.print();
    }
}

