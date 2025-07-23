class Gold {

    static String goldType;
    static String goldPurity;
    static String goldWeight;
    static boolean isAvailable;
    static String goldPrice;

    public static boolean goldDetailsCollecting(String type, String purity, String weight, String price, boolean available) {

        boolean isGoldDetailsCollected = false;
        boolean typeValid = false;
        boolean purityValid = false;
        boolean weightValid = false;
        boolean priceValid = false;
        boolean availabilityValid = false;

        if (type != null) {
            goldType = type;
            typeValid = true;
        } else {
            System.out.println("Please enter the gold type");
        }

        if (purity != null) {
            goldPurity = purity;
            purityValid = true;
        } else {
            System.out.println("Please enter the gold purity");
        }

        if (weight != null) {
            goldWeight = weight;
            weightValid = true;
        } else {
            System.out.println("Please enter the gold weight");
        }

        if (price != null) {
            goldPrice = price;
            priceValid = true;
        } else {
            System.out.println("Please enter the gold price");
        }

        isAvailable = available;
        availabilityValid = true;

        if (typeValid && purityValid && weightValid && priceValid && availabilityValid) {
            isGoldDetailsCollected = true;
        }

        return isGoldDetailsCollected;
    }

    public static void getGoldInfo() {

        System.out.println("Gold Type       : " + goldType);
        System.out.println("Gold Purity     : " + goldPurity);
        System.out.println("Gold Weight     : " + goldWeight);
        System.out.println("Gold Price      : " + goldPrice);
        System.out.println("Is Available?   : " + isAvailable);
    }
}
