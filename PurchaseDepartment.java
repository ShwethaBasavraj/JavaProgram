class PurchaseDepartment {
    public static void placeOrder(String product1, String product2, String product3) {
        System.out.println("Purchase department is placing the order.");
        Warehouse.receive(product1, product2, product3);
    }
}