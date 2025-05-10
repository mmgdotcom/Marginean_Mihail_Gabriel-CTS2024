package exerciti;

public class ClasaA {
    private int a = 100;
    public int sum() {
        int a = 50;
        class A {
            int a = 20;
            public int sum(int a) {
                return 3 * this.a;
            }
        }
        A obj = new A();
        return obj.sum(a);
    }
}

class Program {
    public static void main(String[] args) {
        ClasaA clasaA = new ClasaA();
        System.out.println(clasaA.sum());
    }
}

