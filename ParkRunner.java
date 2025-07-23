class ParkRunner {
    public static void main(String[] args) {
        boolean collected = Park.parkDetailsCollecting("Green Garden", "City Center", "6:00 AM", "Public", true);

        if (collected) {
            Park.getParkInfo();
        } else {
            System.out.println("Park details are incomplete.");
        }
    }
}
