class Manager {
    public static void approve(String product1, String product2, String product3) {
        System.out.println("Manager approved the product request.");
        Finance.sanction(product1, product2, product3);
    }
}
