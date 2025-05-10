package exerciti;

public class S18 {
    public static void main(String[] args) {
        Thread fir1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {}
            }
        });

        fir1.setDaemon(true);
        fir1.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException ex) {}
    }
}

