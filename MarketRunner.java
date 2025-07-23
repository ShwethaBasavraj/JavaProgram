class MarketRunner {
    public static void main(String[] args) {
        boolean collected = Market.marketDetailsCollecting("Central Market", "Downtown", "2025-08-01", "Retail", true);

        if (collected) {
            Market.getMarketInfo();
        } else {
            System.out.println("Market details are incomplete.");
        }
    }
}
