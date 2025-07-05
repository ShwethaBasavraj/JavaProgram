class Projector {

    static String projectorId = "PRJ12345";
    static String projectorModel = "Epson X200";
    static String projectorBrand = "Epson";
    static int resolutionWidth = 1920;
    static int resolutionHeight = 1080;
    static int brightnessLevel = 3200; 
    static String contrastRatio = "10000:1";
    static int lampHoursUsed = 1200;
    static int maxLampHours = 5000;
    static String inputSource = "HDMI1";
    static boolean isPoweredOn = true;
    static int currentVolume = 15;
    static double zoomLevel = 1.2;
    static int keystoneCorrection = 5; 
    static String aspectRatio = "16:9";
    static double throwDistance = 3.5; 
    static int screenSizeInches = 100;
    static String firmwareVersion = "v2.3.1";
    static String serialNumber = "SN987654321";
    static String projectorLocation = "Conference Room A";

	public static void main(String[] args) {
        
        System.out.println(projectorId);
        System.out.println(projectorModel);
        System.out.println(projectorBrand);
        System.out.println(resolutionWidth );
		System.out.println(resolutionHeight);
        System.out.println(brightnessLevel);
        System.out.println(contrastRatio);
        System.out.println(lampHoursUsed);
        System.out.println(maxLampHours);
        System.out.println(inputSource);
        System.out.println(isPoweredOn);
        System.out.println(currentVolume);
        System.out.println(zoomLevel);
        System.out.println(keystoneCorrection + "°");
        System.out.println(aspectRatio);
        System.out.println(throwDistance + " meters");
        System.out.println(screenSizeInches + " inches");
        System.out.println(firmwareVersion);
        System.out.println(serialNumber);
        System.out.println(projectorLocation);
		
		System.out.println();
		
	projectorId = "PRJ12345";
    projectorModel = "Epson X200";
    projectorBrand = "Epson";
    resolutionWidth = 1920;
    resolutionHeight = 1080;
    brightnessLevel = 3200; 
    contrastRatio = "10000:1";
    lampHoursUsed = 1200;
    maxLampHours = 5000;
    inputSource = "HDMI1";
    isPoweredOn = true;
    currentVolume = 15;
    zoomLevel = 1.2;
    keystoneCorrection = 5; 
    aspectRatio = "16:9";
    throwDistance = 3.5; 
    screenSizeInches = 100;
    firmwareVersion = "v2.3.1";
    serialNumber = "SN987654321";
    projectorLocation = "Conference Room A";
	
		System.out.println("=== Projector Information ===");
        System.out.println("Projector ID: " + projectorId);
        System.out.println("Model: " + projectorModel);
        System.out.println("Brand: " + projectorBrand);
        System.out.println("Resolution: " + resolutionWidth);
		System.out.println("Resolution: " +  resolutionHeight);
        System.out.println("Brightness Level: " + brightnessLevel + " lumens");
        System.out.println("Contrast Ratio: " + contrastRatio);
        System.out.println("Lamp Hours Used: " + lampHoursUsed);
        System.out.println("Max Lamp Hours: " + maxLampHours);
        System.out.println("Input Source: " + inputSource);
        System.out.println("Powered On: " + isPoweredOn);
        System.out.println("Current Volume: " + currentVolume);
        System.out.println("Zoom Level: " + zoomLevel);
        System.out.println("Keystone Correction: " + keystoneCorrection + "°");
        System.out.println("Aspect Ratio: " + aspectRatio);
        System.out.println("Throw Distance: " + throwDistance + " meters");
        System.out.println("Screen Size: " + screenSizeInches + " inches");
        System.out.println("Firmware Version: " + firmwareVersion);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Location: " + projectorLocation);
    }
}