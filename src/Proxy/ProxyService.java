package Proxy;

class ProxyService implements Service {
    private RealService realService;

    public void perform() {
        if (realService == null) {
            realService = new RealService();
        }
        System.out.println("Proxy checks access before invoking real service.");
        realService.perform();
    }
}
