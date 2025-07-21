class Gym{

    
    static String gymName = "Iron Temple Fitness";
    static String gymLocation = "Downtown Avenue, Block B";
    static String gymId = "GYM202506";
    static int totalMembers = 150;
    static int totalTrainers = 8;
    static int totalEquipment = 65;
    static boolean hasCardioZone = true;
    static boolean hasWeightliftingZone = true;
    static boolean hasSwimmingPool = false;
    static boolean hasSauna = true;
    static String openingTime = "06:00 AM";
    static String closingTime = "10:00 PM";
    static double monthlyFee = 49.99;
    static double yearlyFee = 499.99;
    static String headTrainerName = "Alex Morgan";
    static int headTrainerExperienceYears = 12;
    static String contactEmail = "contact@irontemple.com";
    static String contactPhone = "+1-555-987-6543";
    static boolean offersPersonalTraining = true;
    static boolean hasNutritionist = true;

    public static void main(String[] args) {
       
        System.out.println("=== Gym Information ===");
        System.out.println("Gym Name: " + gymName);
        System.out.println("Location: " + gymLocation);
        System.out.println("Gym ID: " + gymId);
        System.out.println("Total Members: " + totalMembers);
        System.out.println("Total Trainers: " + totalTrainers);
        System.out.println("Total Equipment: " + totalEquipment);
        System.out.println("Cardio Zone Available: " + hasCardioZone);
        System.out.println("Weightlifting Zone Available: " + hasWeightliftingZone);
        System.out.println("Swimming Pool Available: " + hasSwimmingPool);
        System.out.println("Sauna Available: " + hasSauna);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("Monthly Fee: $" + monthlyFee);
        System.out.println("Yearly Fee: $" + yearlyFee);
        System.out.println("Head Trainer: " + headTrainerName);
        System.out.println("Trainer Experience: " + headTrainerExperienceYears + " years");
        System.out.println("Contact Email: " + contactEmail);
        System.out.println("Contact Phone: " + contactPhone);
        System.out.println("Offers Personal Training: " + offersPersonalTraining);
        System.out.println("Has Nutritionist: " + hasNutritionist);
    }
}