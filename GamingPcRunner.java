class GamingPcRunner{
    public static void main(String[] args) {
        boolean collected = GamingPc.gamingPcDetailsCollecting("Intel Core i9", "NVIDIA RTX 4090", "32GB", "1TB SSD", true);

        if (collected) {
            GamingPc.getGamingPcInfo();
        } else {
            System.out.println("Gaming PC details are incomplete.");
        }
    }
}
