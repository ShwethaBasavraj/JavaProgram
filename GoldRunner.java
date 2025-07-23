class GoldRunner {
    public static void main(String[] args) {
        boolean collected = Gold.goldDetailsCollecting("Necklace", "22K", "15g", "75,000", true);

        if (collected) {
            Gold.getGoldInfo();
        } else {
            System.out.println("Gold details are incomplete.");
        }
    }
}
