class TailorRunner
 {
    public static void main(String[] args) {
        boolean collected = Tailor.tailorDetailsCollecting("Ravi", "10", "Men's Suits", "MG Road, Bangalore", true);

        if (collected) {
            Tailor.getTailorInfo();
        } else {
            System.out.println("Tailor details are incomplete.");
        }
    }
}
