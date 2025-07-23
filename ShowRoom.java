class ShowRoom {
    static int cars;

    public static void main(String[] vote) {
        System.out.println("main started");
        newCar(40);
        System.out.println("Total cars: " +""+cars);
        System.out.println("main ended");
    }

    public static void newCar(int car) {
        System.out.println("newCar adding started");
        cars = cars + car;
        System.out.println("newCar adding ended");
    }
}
