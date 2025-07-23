class Projector {

    static boolean isConnected;
    static int maxBrightness = 10;
    static int currentBrightness ;
    static int minBrightness ;


    // 1.
    public static void onOrOff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The Projector is turned ON");
        } else {
            isConnected = false;
            System.out.println("The Projector is turned OFF");
        }
    }

    // 2.
    public static void increaseBrightness() {
        System.out.println("increaseBrightness started");
        if (isConnected == true) {
            if (currentBrightness < maxBrightness) {
                currentBrightness = currentBrightness+1;
                System.out.println("Current Brightness: " + currentBrightness);
            } else {
                System.out.println("Max brightness reached");
            }
        } else {
            System.out.println("Turn on the projector first");
        }
    }

    // 3.
    public static void decreaseBrightness() {
        System.out.println("decreaseBrightness started");
        if (isConnected == true) {
            if (currentBrightness > minBrightness) {
                currentBrightness = currentBrightness-1;
                System.out.println("Current Brightness: " + currentBrightness);
            } else {
                System.out.println("Min brightness reached");
            }
        } else {
            System.out.println("Turn on the projector first");
			System.out.println("decreaseBrightness ended");
        }
    
	}
}
