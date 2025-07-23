class Calculator {
    static int total;

    public static void main(String[] add) {
        System.out.println("The main started");

        add(20,88);

        System.out.println("The sum of a and b is " + total);
        System.out.println("The main ended");
    }

    public static void add(int a, int b) {
        System.out.println("The addition started");
        total = a + b;
        System.out.println("The addition  ended");
    }
}
