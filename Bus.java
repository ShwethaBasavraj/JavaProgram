class Bus {
    static int passangers;

    public static void main(String[] vote) {
        System.out.println("main started");
        addedPassanger(200);
        System.out.println("Total passangers: " +""+passangers);
        System.out.println("main ended");
    }

    public static void addedPassanger(int passanger) {
        System.out.println("passangers adding started");
        passangers = passangers + passanger;
        System.out.println("passangers adding ended");
    }
}
