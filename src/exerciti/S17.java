package exerciti;

public class S17 {
    public static void main(String[] args) {
        var valori = new int[]{1, 2, 3};
        try {
            for (int i = 1; i < 10; i++) {
                System.out.print(valori[i]);
            }
        } catch (Exception exception) {
            System.out.print("E");
        } finally {
            System.out.print("F");
        }
    }
}

