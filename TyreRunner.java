class TyreRunner {
    public static void main(String[] args) {
        boolean collected = Tyre.tyreDetailsCollecting("Michelin", "205/55 R16", "Radial", "2025-03-10", true);

        if (collected) {
            Tyre.getTyreInfo();
        } else {
            System.out.println("Tyre details are incomplete.");
        }
    }
}
