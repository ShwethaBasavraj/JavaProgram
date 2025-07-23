class Market {

    static String marketName;
    static String marketLocation;
    static String openingDate;
    static boolean isOpen;
    static String marketType;

    public static boolean marketDetailsCollecting(String name, String location, String date, String type, boolean open) {

        boolean isMarketDetailsCollected = false;
        boolean nameValid = false;
        boolean locationValid = false;
        boolean dateValid = false;
        boolean typeValid = false;
        boolean openValid = false;

        if (name != null) {
            marketName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the market name");
        }

        if (location != null) {
            marketLocation = location;
            locationValid = true;
        } else {
            System.out.println("Please enter the market location");
        }

        if (date != null) {
            openingDate = date;
            dateValid = true;
        } else {
            System.out.println("Please enter the opening date");
        }

        if (type != null) {
            marketType = type;
            typeValid = true;
        } else {
            System.out.println("Please enter the market type");
        }

        isOpen = open;
        openValid = true;

        if (nameValid && locationValid && dateValid && typeValid && openValid) {
            isMarketDetailsCollected = true;
        }

        return isMarketDetailsCollected;
    }

    public static void getMarketInfo() {

        System.out.println("Market Name       : " + marketName);
        System.out.println("Market Location   : " + marketLocation);
        System.out.println("Opening Date      : " + openingDate);
        System.out.println("Market Type       : " + marketType);
        System.out.println("Is Market Open?   : " + isOpen);
    }
}
