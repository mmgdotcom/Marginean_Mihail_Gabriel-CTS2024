package exerciti;

public class A {
    private static int a = 10, b = 20;
    static {
        int a = 100;
        b = 100;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.a + A.a + a.b);
    }
}

