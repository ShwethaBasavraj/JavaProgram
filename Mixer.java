class Mixer {

    static boolean isConnected;
    static int maxSpeed = 10;
    static int currentSpeed;
    static int minSpeed;

    // 1. 
    public static void onOrOff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Mixer is turned ON");
        } else {
            isConnected = false;
            System.out.println("The Mixer is turned OFF");
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
            System.out.println("Turn on the mixer first");
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
            System.out.println("Turn on the mixer first");
            System.out.println("decreaseSpeed ended");
        }
    }

    // 4.
    static int maxTimer = 60;
    static int currentTimer;
    static int minTimer;

    public static void increaseTimer() {
        System.out.println("increaseTimer started");
        if (isConnected = true) {
            if (currentTimer < maxTimer) {
                currentTimer = currentTimer + 1;
                System.out.println("Current Timer: " + currentTimer);
            } else {
                System.out.println("Max timer reached");
            }
        } else {
            System.out.println("Turn on the mixer first");
        }
    }

    // 5.
    public static void decreaseTimer() {
        System.out.println("decreaseTimer started");
        if (isConnected = true) {
            if (currentTimer > minTimer) {
                currentTimer = currentTimer - 1;
                System.out.println("Current Timer: " + currentTimer);
            } else {
                System.out.println("Min timer reached");
            }
        } else {
            System.out.println("Turn on the mixer first");
            System.out.println("decreaseTimer ended");
        }
    }
}
