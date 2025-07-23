class BA {
    public static void main(String account[]) {
        System.out.println("main Started");

        double balance = 10000.00;
        double amount = 2000.00;

       
        BA1.credit(amount, balance);

        System.out.println("main ended");
    }
}
