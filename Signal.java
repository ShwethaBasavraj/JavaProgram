class Signal {

    static String signalColor;
    static String signalType;
    static String duration;
    static boolean isSignalOn;
    static String signalLocation;

    public static boolean signalDetailsCollecting(String color, String type, String time, String location, boolean status) {

        boolean isSignalDetailsCollected = false;
        boolean colorValid = false;
        boolean typeValid = false;
        boolean durationValid = false;
        boolean locationValid = false;
        boolean statusValid = false;

        if (color != null) {
            signalColor = color;
            colorValid = true;
        } else {
            System.out.println("Please enter the signal color");
        }

        if (type != null) {
            signalType = type;
            typeValid = true;
        } else {
            System.out.println("Please enter the signal type");
        }

        if (time != null) {
            duration = time;
            durationValid = true;
        } else {
            System.out.println("Please enter the signal duration");
        }

        if (location != null) {
            signalLocation = location;
            locationValid = true;
        } else {
            System.out.println("Please enter the signal location");
        }

        isSignalOn = status;
        statusValid = true;

        if (colorValid && typeValid && durationValid && locationValid && statusValid) {
            isSignalDetailsCollected = true;
        }

        return isSignalDetailsCollected;
    }

    public static void getSignalInfo() {

        System.out.println("Signal Color       : " + signalColor);
        System.out.println("Signal Type        : " + signalType);
        System.out.println("Signal Duration    : " + duration);
        System.out.println("Signal Location    : " + signalLocation);
        System.out.println("Is Signal On?      : " + isSignalOn);
    }
}
