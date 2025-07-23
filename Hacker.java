class Hacker {

    static String hackerName;
    static String skillLevel;
    static String knownLanguage;
    static boolean isBlackHat;
    static String location;

    public static boolean hackerDetailsCollecting(String name, String level, String language, String loc, boolean blackHat) {

        boolean isHackerDetailsCollected = false;
        boolean nameValid = false;
        boolean levelValid = false;
        boolean languageValid = false;
        boolean locationValid = false;
        boolean blackHatValid = false;

        if (name != null) {
            hackerName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the hacker's name");
        }

        if (level != null) {
            skillLevel = level;
            levelValid = true;
        } else {
            System.out.println("Please enter the skill level");
        }

        if (language != null) {
            knownLanguage = language;
            languageValid = true;
        } else {
            System.out.println("Please enter the known programming language");
        }

        if (loc != null) {
            location = loc;
            locationValid = true;
        } else {
            System.out.println("Please enter the location");
        }

        isBlackHat = blackHat;
        blackHatValid = true;

        if (nameValid && levelValid && languageValid && locationValid && blackHatValid) {
            isHackerDetailsCollected = true;
        }

        return isHackerDetailsCollected;
    }

    public static void getHackerInfo() {

        System.out.println("Hacker Name     : " + hackerName);
        System.out.println("Skill Level     : " + skillLevel);
        System.out.println("Known Language  : " + knownLanguage);
        System.out.println("Location        : " + location);
        System.out.println("Is Black Hat?   : " + isBlackHat);
    }
}
