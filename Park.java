class Park {
    static int visitors;

    public static void main(String[] args) {
        System.out.println("main started");
        addVisitors(300);
        System.out.println("Total visitors: " + visitors);
        System.out.println("main ended");
    }

    public static void addVisitors(int count) {
        System.out.println("visitors adding started");
        visitors = visitors + count;
        System.out.println("visitors adding ended");
    }
}
