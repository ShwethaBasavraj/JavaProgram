class GamingPc {

    static String processor;
    static String graphicsCard;
    static String ramSize;
    static boolean isVRReady;
    static String storageType;

    public static boolean gamingPcDetailsCollecting(String cpu, String gpu, String ram, String storage, boolean vrReady) {

        boolean isGamingPcDetailsCollected = false;
        boolean processorValid = false;
        boolean graphicsCardValid = false;
        boolean ramValid = false;
        boolean storageValid = false;
        boolean vrValid = false;

        if (cpu != null) {
            processor = cpu;
            processorValid = true;
        } else {
            System.out.println("Please enter the processor name");
        }

        if (gpu != null) {
            graphicsCard = gpu;
            graphicsCardValid = true;
        } else {
            System.out.println("Please enter the graphics card name");
        }

        if (ram != null) {
            ramSize = ram;
            ramValid = true;
        } else {
            System.out.println("Please enter the RAM size");
        }

        if (storage != null) {
            storageType = storage;
            storageValid = true;
        } else {
            System.out.println("Please enter the storage type");
        }

        isVRReady = vrReady;
        vrValid = true;

        if (processorValid && graphicsCardValid && ramValid && storageValid && vrValid) {
            isGamingPcDetailsCollected = true;
        }

        return isGamingPcDetailsCollected;
    }

    public static void getGamingPcInfo() {

        System.out.println("Processor       : " + processor);
        System.out.println("Graphics Card   : " + graphicsCard);
        System.out.println("RAM Size        : " + ramSize);
        System.out.println("Storage Type    : " + storageType);
        System.out.println("VR Ready?       : " + isVRReady);
    }
}
