class DisneyLandRunner {
    public static void main(String[] args) {
        boolean collected = DisneyLand.disneyLandDetailsCollecting("Disneyland Paris", "France", "1992", "Fairy Tale & Adventure", true);

        if (collected) {
            DisneyLand.getDisneyLandInfo();
        } else {
            System.out.println("Disneyland details are incomplete.");
        }
    }
}
