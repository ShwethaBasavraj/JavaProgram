class Tyre {

    static String brandName;
    static String size;
    static String tyreType;
    static boolean isTubeless;
    static String manufactureDate;

    public static boolean tyreDetailsCollecting(String brand, String tyreSize, String type, String date, boolean tubeless) {

        boolean isTyreDetailsCollected = false;
        boolean brandValid = false;
        boolean sizeValid = false;
        boolean typeValid = false;
        boolean dateValid = false;
        boolean tubelessValid = false;

        if (brand != null) {
            brandName = brand;
            brandValid = true;
        } else {
            System.out.println("Please enter the brand name");
        }

        if (tyreSize != null) {
            size = tyreSize;
            sizeValid = true;
        } else {
            System.out.println("Please enter the tyre size");
        }

        if (type != null) {
            tyreType = type;
            typeValid = true;
        } else {
            System.out.println("Please enter the tyre type");
        }

        if (date != null) {
            manufactureDate = date;
            dateValid = true;
        } else {
            System.out.println("Please enter the manufacture date");
        }

        isTubeless = tubeless;
        tubelessValid = true;

        if (brandValid && sizeValid && typeValid && dateValid && tubelessValid) {
            isTyreDetailsCollected = true;
        }

        return isTyreDetailsCollected;
    }

    public static void getTyreInfo() {

        System.out.println("Brand Name         : " + brandName);
        System.out.println("Size               : " + size);
        System.out.println("Tyre Type          : " + tyreType);
        System.out.println("Manufacture Date   : " + manufactureDate);
        System.out.println("Is Tubeless?       : " + isTubeless);
    }
}
