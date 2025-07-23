class MakeUpKit {

    static String kitName;
    static String brand;
    static String itemCount;
    static boolean isWaterproof;
    static String shadeRange;

    public static boolean makeUpKitDetailsCollecting(String name, String brandName, String count, String shades, boolean waterproof) {

        boolean isMakeUpKitDetailsCollected = false;
        boolean nameValid = false;
        boolean brandValid = false;
        boolean countValid = false;
        boolean shadeValid = false;
        boolean waterproofValid = false;

        if (name != null) {
            kitName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the kit name");
        }

        if (brandName != null) {
            brand = brandName;
            brandValid = true;
        } else {
            System.out.println("Please enter the brand name");
        }

        if (count != null) {
            itemCount = count;
            countValid = true;
        } else {
            System.out.println("Please enter the item count");
        }

        if (shades != null) {
            shadeRange = shades;
            shadeValid = true;
        } else {
            System.out.println("Please enter the shade range");
        }

        isWaterproof = waterproof;
        waterproofValid = true;

        if (nameValid && brandValid && countValid && shadeValid && waterproofValid) {
            isMakeUpKitDetailsCollected = true;
        }

        return isMakeUpKitDetailsCollected;
    }

    public static void getMakeUpKitInfo() {

        System.out.println("Kit Name       : " + kitName);
        System.out.println("Brand          : " + brand);
        System.out.println("Item Count     : " + itemCount);
        System.out.println("Shade Range    : " + shadeRange);
        System.out.println("Is Waterproof? : " + isWaterproof);
    }
}
