class Tv {

    static boolean isConnected;
    static int maxVolume = 10;
    static int currentVolume;
    static int minVolume;

    // 1. 
    public static void onOrOff() {
        if (isConnected == false) {
            isConnected = true;
            System.out.println("The TV is turned ON");
        } else {
            isConnected = false;
            System.out.println("The TV is turned OFF");
        }
    }

    // 2. 
    public static void increaseVolume() {
        System.out.println("increaseVolume started");
        if (isConnected = true) {
            if (currentVolume < maxVolume) {
                currentVolume = currentVolume + 1;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Max volume reached");
            }
        } else {
            System.out.println("Turn on the TV first");
        }
    }

    // 3. 
    public static void decreaseVolume() {
        System.out.println("decreaseVolume started");
        if (isConnected = true) {
            if (currentVolume > minVolume) {
                currentVolume = currentVolume - 1;
                System.out.println("Current Volume: " + currentVolume);
            } else {
                System.out.println("Min volume reached");
            }
        } else {
            System.out.println("Turn on the TV first");
            System.out.println("decreaseVolume ended");
        }
    }

    // 4.
    static int maxChannel = 100;
    static int currentChannel;
    static int minChannel;

    public static void increaseChannel() {
        System.out.println("increaseChannel started");
        if (isConnected = true) {
            if (currentChannel < maxChannel) {
                currentChannel = currentChannel + 1;
                System.out.println("Current Channel: " + currentChannel);
            } else {
                System.out.println("Max channel reached");
            }
        } else {
            System.out.println("Turn on the TV first");
        }
    }

    // 5.
    public static void decreaseChannel() {
        System.out.println("decreaseChannel started");
        if (isConnected = true) {
            if (currentChannel > minChannel) {
                currentChannel = currentChannel - 1;
                System.out.println("Current Channel: " + currentChannel);
            } else {
                System.out.println("Min channel reached");
            }
        } else {
            System.out.println("Turn on the TV first");
            System.out.println("decreaseChannel ended");
        }
    }
}
