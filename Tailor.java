class Tailor {

    static String tailorName;
    static String experienceYears;
    static String specialty;
    static boolean isAvailable;
    static String shopLocation;

    public static boolean tailorDetailsCollecting(String name, String experience, String skill, String location, boolean available) {

        boolean isTailorDetailsCollected = false;
        boolean nameValid = false;
        boolean experienceValid = false; 
        boolean skillValid = false;
        boolean locationValid = false;
        boolean availabilityValid = false;

        if (name != null) {
            tailorName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the tailor's name");
        }

        if (experience != null) {
            experienceYears = experience;
            experienceValid = true;
        } else {
            System.out.println("Please enter the years of experience");
        }

        if (skill != null) {
            specialty = skill;
            skillValid = true;
        } else {
            System.out.println("Please enter the specialty");
        }

        if (location != null) {
            shopLocation = location;
            locationValid = true;
        } else {
            System.out.println("Please enter the shop location");
        }

        isAvailable = available;
        availabilityValid = true;

        if (nameValid && experienceValid && skillValid && locationValid && availabilityValid) {
            isTailorDetailsCollected = true;
        }

        return isTailorDetailsCollected;
    }

    public static void getTailorInfo() {

        System.out.println("Tailor Name        : " + tailorName);
        System.out.println("Experience (years) : " + experienceYears);
        System.out.println("Specialty          : " + specialty);
        System.out.println("Shop Location      : " + shopLocation);
        System.out.println("Available Now?     : " + isAvailable);
    }
}
