class WalkieTalkie {

    static String modelName;
    static String frequencyRange;
    static String batteryLife;
    static boolean isFunctional;
    static String brandName;

    public static boolean walkieTalkieDetailsCollecting(String model, String frequency, String battery, String brand, boolean functional) {

        boolean isWalkieTalkieDetailsCollected = false;
        boolean modelValid = false;
        boolean frequencyValid = false;
        boolean batteryValid = false;
        boolean brandValid = false;
        boolean functionalValid = false;

        if (model != null) {
            modelName = model;
            modelValid = true;
        } else {
            System.out.println("Please enter the model name");
        }

        if (frequency != null) {
            frequencyRange = frequency;
            frequencyValid = true;
        } else {
            System.out.println("Please enter the frequency range");
        }

        if (battery != null) {
            batteryLife = battery;
            batteryValid = true;
        } else {
            System.out.println("Please enter the battery life");
        }

        if (brand != null) {
            brandName = brand;
            brandValid = true;
        } else {
            System.out.println("Please enter the brand name");
        }

        isFunctional = functional;
        functionalValid = true;

        if (modelValid && frequencyValid && batteryValid && brandValid && functionalValid) {
            isWalkieTalkieDetailsCollected = true;
        }

        return isWalkieTalkieDetailsCollected;
    }

    public static void getWalkieTalkieInfo() {

        System.out.println("Model Name        : " + modelName);
        System.out.println("Frequency Range   : " + frequencyRange);
        System.out.println("Battery Life      : " + batteryLife);
        System.out.println("Brand Name        : " + brandName);
        System.out.println("Is Functional?    : " + isFunctional);
    }
}
