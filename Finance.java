class Finance {
    public static void sanction(String product1, String product2, String product3) {
        System.out.println("Finance department has sanctioned the budget.");
        PurchaseDepartment.placeOrder(product1, product2, product3);
    }
}