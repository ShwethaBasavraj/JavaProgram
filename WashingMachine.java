class WashingMachine {

    static boolean isConnected;
    static int maxSpeed = 10;
    static int currentSpeed;
    static int minSpeed;

    // 1. 
    public static void onOrOff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Washing Machine is turned ON");
        } else {
            isConnected = false;
            System.out.println("The Washing Machine is turned OFF");
        }
    }

    // 2.
    public static void increaseSpeed() {
        System.out.println("increaseSpeed started");
        if (isConnected = true) {
            if (currentSpeed < maxSpeed) {
                currentSpeed = currentSpeed + 1;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Max speed reached");
            }
        } else {
            System.out.println("Turn on the washing machine first");
        }
    }

    // 3. 
    public static void decreaseSpeed() {
        System.out.println("decreaseSpeed started");
        if (isConnected = true) {
            if (currentSpeed > minSpeed) {
                currentSpeed = currentSpeed - 1;
                System.out.println("Current Speed: " + currentSpeed);
            } else {
                System.out.println("Min speed reached");
            }
        } else {
            System.out.println("Turn on the washing machine first");
            System.out.println("decreaseSpeed ended");
        }
    }
    
    // 4. 
    static int maxWaterLevel = 10;
    static int currentWaterLevel;
    static int minWaterLevel;
    
    public static void increaseWaterLevel() {
        System.out.println("increaseWaterLevel started");
        if (isConnected = true) {
            if (currentWaterLevel < maxWaterLevel) {
                currentWaterLevel = currentWaterLevel + 1;
                System.out.println("Current Water Level: " + currentWaterLevel);
            } else {
                System.out.println("Max water level reached");
            }
        } else {
            System.out.println("Turn on the washing machine first");
        }
    }

    // 5. 
    public static void decreaseWaterLevel() {
        System.out.println("decreaseWaterLevel started");
        if (isConnected = true) {
            if (currentWaterLevel > minWaterLevel) {
                currentWaterLevel = currentWaterLevel - 1;
                System.out.println("Current Water Level: " + currentWaterLevel);
            } else {
                System.out.println("Min water level reached");
            }
        } else {
            System.out.println("Turn on the washing machine first");
            System.out.println("decreaseWaterLevel ended");
        }
    }
}
