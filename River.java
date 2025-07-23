class River {

    static String riverName;
    static String origin;
    static String length;
    static boolean isPolluted;
    static String country;

    public static boolean riverDetailsCollecting(String name, String source, String riverLength, String riverCountry, boolean polluted) {

        boolean isRiverDetailsCollected = false;
        boolean nameValid = false;
        boolean originValid = false;
        boolean lengthValid = false;
        boolean countryValid = false;
        boolean pollutedValid = false;

        if (name != null) {
            riverName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the river name");
        }

        if (source != null) {
            origin = source;
            originValid = true;
        } else {
            System.out.println("Please enter the river origin");
        }

        if (riverLength != null) {
            length = riverLength;
            lengthValid = true;
        } else {
            System.out.println("Please enter the river length");
        }

        if (riverCountry != null) {
            country = riverCountry;
            countryValid = true;
        } else {
            System.out.println("Please enter the country");
        }

        isPolluted = polluted;
        pollutedValid = true;

        if (nameValid && originValid && lengthValid && countryValid && pollutedValid) {
            isRiverDetailsCollected = true;
        }

        return isRiverDetailsCollected;
    }

    public static void getRiverInfo() {

        System.out.println("River Name     : " + riverName);
        System.out.println("Origin         : " + origin);
        System.out.println("Length         : " + length);
        System.out.println("Country        : " + country);
        System.out.println("Is Polluted?   : " + isPolluted);
    }
}
