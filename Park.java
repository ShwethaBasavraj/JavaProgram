class Park {

    static String parkName;
    static String location;
    static String openTime;
    static boolean isOpenToPublic;
    static String parkType;

    public static boolean parkDetailsCollecting(String name, String loc, String time, String type, boolean open) {

        boolean isParkDetailsCollected = false;
        boolean nameValid = false;
        boolean locationValid = false;
        boolean timeValid = false;
        boolean typeValid = false;
        boolean openValid = false;

        if (name != null) {
            parkName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the park name");
        }

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Please enter the location");
        }

        if (time != null) {
            openTime = time;
            timeValid = true;
        } else {
            System.out.println("Please enter the opening time");
        }

        if (type != null) {
            parkType = type;
            typeValid = true;
        } else {
            System.out.println("Please enter the park type");
        }

        isOpenToPublic = open;
        openValid = true;

        if (nameValid && locationValid && timeValid && typeValid && openValid) {
            isParkDetailsCollected = true;
        }

        return isParkDetailsCollected;
    }

    public static void getParkInfo() {

        System.out.println("Park Name         : " + parkName);
        System.out.println("Location          : " + location);
        System.out.println("Opening Time      : " + openTime);
        System.out.println("Park Type         : " + parkType);
        System.out.println("Open to Public?   : " + isOpenToPublic);
    }
}
