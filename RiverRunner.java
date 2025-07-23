class RiverRunner {
    public static void main(String[] args) {
        boolean collected = River.riverDetailsCollecting("Ganges", "Himalayas", "2525 km", "India", true);

        if (collected) {
            River.getRiverInfo();
        } else {
            System.out.println("River details are incomplete.");
        }
    }
}
