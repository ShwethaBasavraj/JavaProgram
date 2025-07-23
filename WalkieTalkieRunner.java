class WalkieTalkieRunner {
    public static void main(String[] args) {
        boolean collected = WalkieTalkie.walkieTalkieDetailsCollecting("WT-X100", "400-470 MHz", "12 hours", "Motorola", true);

        if (collected) {
            WalkieTalkie.getWalkieTalkieInfo();
        } else {
            System.out.println("WalkieTalkie details are incomplete.");
        }
    }
}
