package exerciti;

class A1 {
    static int valoare;

    static {
        valoare = 10;
    }

    public A1() {
        valoare = valoare + 1;
    }

    public int get() {
        return valoare;
    }
}

class Teste2 {
    public static void main(String[] args) {
        A1 o1 = new A1(), o2 = new A1();
        System.out.println(o1.get() + " " + o2.get());
    }
}

