class DisneyLand {

    static String parkName;
    static String location;
    static String openingYear;
    static boolean isCurrentlyOpen;
    static String theme;

    public static boolean disneyLandDetailsCollecting(String name, String loc, String year, String themeType, boolean open) {

        boolean isDisneyLandDetailsCollected = false;
        boolean nameValid = false;
        boolean locationValid = false;
        boolean yearValid = false;
        boolean themeValid = false;
        boolean openValid = false;

        if (name != null) {
            parkName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the Disneyland name");
        }

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Please enter the location");
        }

        if (year != null) {
            openingYear = year;
            yearValid = true;
        } else {
            System.out.println("Please enter the opening year");
        }

        if (themeType != null) {
            theme = themeType;
            themeValid = true;
        } else {
            System.out.println("Please enter the theme");
        }

        isCurrentlyOpen = open;
        openValid = true;

        if (nameValid && locationValid && yearValid && themeValid && openValid) {
            isDisneyLandDetailsCollected = true;
        }

        return isDisneyLandDetailsCollected;
    }

    public static void getDisneyLandInfo() {

        System.out.println("Park Name        : " + parkName);
        System.out.println("Location         : " + location);
        System.out.println("Opening Year     : " + openingYear);
        System.out.println("Theme            : " + theme);
        System.out.println("Is Currently Open: " + isCurrentlyOpen);
    }
}
