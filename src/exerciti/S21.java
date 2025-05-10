package exerciti;

class Counter extends Thread {
    private long i = 10, j = 50;
    private boolean stop;

    @Override
    public void run() {
        while (!stop) {
            if (i <= j) {
                System.out.println(i++);
            }
        }
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }
}

public class S21 {
    public static void main(String[] args) {
        Counter c = new Counter();
        c.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Eroare!");
        }

        c.setStop(true);

        try {
            c.join();
        } catch (InterruptedException ex) {
            System.out.println("Eroare!");
        }

        System.out.println("Stop.");
    }
}

