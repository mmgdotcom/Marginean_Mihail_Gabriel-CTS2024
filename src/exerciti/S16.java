package exerciti;

public class S16 {
    static volatile int contor = 0;

    public static void main(String[] args) throws Exception {
        class FirExecutie extends Thread {
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    contor++;
                }
            }
        }

        var fir1 = new FirExecutie();
        var fir2 = new FirExecutie();

        fir1.start();
        fir2.start();

        fir1.join();
        fir2.join();

        System.out.println(contor);
    }
}

