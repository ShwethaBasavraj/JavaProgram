class Platform {
    String platformName;
    String type;
    int platformNumber;
    String status;

    public void getPlatformInfo() {
        System.out.println("Platform Information:");
        System.out.println();
        System.out.println("Platform Name: " + platformName);
        System.out.println("Type: " + type);
        System.out.println("Platform Number: " + platformNumber);
        System.out.println("Status: " + status);
        System.out.println();
    }
}
