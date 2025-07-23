class PurchaseProcess {
    public static void start(String product1, String product2, String product3) {
        System.out.println("The process to buy products has started.");
        Manager.approve(product1, product2, product3);
        System.out.println("Purchase process completed.");
    }
}
