class Dmart {
    static int items;

    public static void main(String[] vote) {
        System.out.println("main started");
        addItems(200);
        System.out.println("Total items: " +""+items);
        System.out.println("main ended");
    }

    public static void addItems(int item) {
        System.out.println("item adding started");
        items = items + item;
        System.out.println("item adding ended");
    }
}
