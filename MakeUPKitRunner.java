class MakeUPKitRunner {
    public static void main(String[] args) {
        boolean collected = MakeUpKit.makeUpKitDetailsCollecting("Glam Pro Kit", "Maybelline", "12 items", "Light to Deep", true);

        if (collected) {
            MakeUpKit.getMakeUpKitInfo();
        } else {
            System.out.println("MakeUp Kit details are incomplete.");
        }
    }
}
