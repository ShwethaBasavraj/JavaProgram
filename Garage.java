class Garage {
    static int vehicles;

    public static void main(String[] args) {
        System.out.println("main started");
        addVehicles(15);
        System.out.println("Total vehicles: " + vehicles);
        System.out.println("main ended");
    }

    public static void addVehicles(int vehicle) {
        System.out.println("vehicles adding started");
        vehicles = vehicles + vehicle;
        System.out.println("vehicles adding ended");
    }
}
