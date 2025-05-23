package Proxy;

public class Program {
    public static void main(String[] args) {

        // Proxy Test
        Service service = new ProxyService();
        service.perform();
    }
}
