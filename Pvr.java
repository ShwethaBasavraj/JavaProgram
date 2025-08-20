class Pvr {
    String pvrName;
    String location;
    boolean isMultiplex;
    int noOfScreens;
    int noOfWorkers;
    Screen screen;

    Pvr() {
    }

    Pvr(String pvrName, String location, boolean isMultiplex, int noOfScreens, int noOfWorkers, Screen screen) {
        this.pvrName = pvrName;
        this.location = location;
        this.isMultiplex = isMultiplex;
        this.noOfScreens = noOfScreens;
        this.noOfWorkers = noOfWorkers;
        this.screen = screen;
    }

    public void getPvrInfo() {
        System.out.println("PVR Information:");
        System.out.println();
        System.out.println("PVR Name: " + pvrName);
        System.out.println("Location: " + location);
        System.out.println("Is Multiplex: " + isMultiplex);
        System.out.println("Number of Screens: " + noOfScreens);
        System.out.println("Number of Workers: " + noOfWorkers);
        System.out.println();

        this.screen.getScreenInfo();
    }
}