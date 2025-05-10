package exerciti;

//public class Application {
//    public static void main(String[] args) {
//        int[] a = {2, 3, 4};
//        int[] b = {10, 20, 30};
//
//        interchange(a, b, 2);
//
//        System.out.println(a[2]);
//        System.out.println(b[2]);
//    }
//
//    public static void interchange(int[] a, int[] b, int index) {
//        a[index] = b[index];
//        b[index] = a[index];
//    }
//}

public class Application {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int[] b = {10, 20, 30};

        System.out.println("Before interchange:");
        printArrays(a, b);

        interchange(a, b, 2);

        System.out.println("\nAfter interchange:");
        printArrays(a, b);

        System.out.println("\nFinal output:");
        System.out.println("a[2] = " + a[2]);
        System.out.println("b[2] = " + b[2]);
    }

    public static void interchange(int[] a, int[] b, int index) {
        System.out.println("\nInside interchange()");
        System.out.println("a[" + index + "] before = " + a[index]);
        System.out.println("b[" + index + "] before = " + b[index]);

        a[index] = b[index];
        System.out.println("a[" + index + "] is now set to b[" + index + "] → " + a[index]);

        b[index] = a[index];
        System.out.println("b[" + index + "] is now set to a[" + index + "] → " + b[index]);
    }

    public static void printArrays(int[] a, int[] b) {
        System.out.print("a = ");
        for (int value : a) System.out.print(value + " ");
        System.out.println();

        System.out.print("b = ");
        for (int value : b) System.out.print(value + " ");
        System.out.println();
    }
}
