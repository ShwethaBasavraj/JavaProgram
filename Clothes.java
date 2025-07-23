class Clothes {

    static String clothType;
    static String clothColor;
    static String clothSize;
    static boolean isAvailable;
    static String clothBrand;

    public static boolean clothesDetailsCollecting(String type, String color, String size, String brand, boolean available) {

        boolean isClothesDetailsCollected = false;
        boolean typeValid = false;
        boolean colorValid = false;
        boolean sizeValid = false;
        boolean brandValid = false;
        boolean availabilityValid = false;

        if (type != null) {
            clothType = type;
            typeValid = true;
        } else {
            System.out.println("Please enter the cloth type");
        }

        if (color != null) {
            clothColor = color;
            colorValid = true;
        } else {
            System.out.println("Please enter the cloth color");
        }

        if (size != null) {
            clothSize = size;
            sizeValid = true;
        } else {
            System.out.println("Please enter the cloth size");
        }

        if (brand != null) {
            clothBrand = brand;
            brandValid = true;
        } else {
            System.out.println("Please enter the cloth brand");
        }

        isAvailable = available;
        availabilityValid = true;

        if (typeValid && colorValid && sizeValid && brandValid && availabilityValid) {
            isClothesDetailsCollected = true;
        }

        return isClothesDetailsCollected;
    }

    public static void getClothesInfo() {

        System.out.println("Cloth Type       : " + clothType);
        System.out.println("Cloth Color      : " + clothColor);
        System.out.println("Cloth Size       : " + clothSize);
        System.out.println("Cloth Brand      : " + clothBrand);
        System.out.println("Is Available?    : " + isAvailable);
    }
}
