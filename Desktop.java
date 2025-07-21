class Desktop {

   
    static String desktopId;
    static String desktopBrand;
    static String processorModel;   
    static int ramSizeGB;
    static int storageSizeGB ;
    static String storageType;
    static String graphicsCard;
    static String operatingSystem;
    static String motherboardModel;
    static boolean hasWiFi;
    static boolean hasBluetooth;
    static int usbPortCount;
    static String powerSupply;
    static String monitorBrand;
    static int monitorSizeInches;
    static String monitorResolution;
    static String serialNumber;
    static String purchaseDate;
    static String desktopLocation;
	
	public static void main(String[] args) {
    
        System.out.println("=== Desktop Information ===");
        System.out.println(desktopId);
        System.out.println(desktopBrand);
        System.out.println(processorModel);
        System.out.println(ramSizeGB + " GB");
        System.out.println(storageSizeGB + " GB");
        System.out.println(storageType);
        System.out.println(graphicsCard);
        System.out.println(operatingSystem);
        System.out.println(motherboardModel);
        System.out.println(hasWiFi);
        System.out.println(hasBluetooth);
        System.out.println(usbPortCount);
        System.out.println(powerSupply);
        System.out.println(monitorBrand);
        System.out.println(monitorSizeInches + " inches");
        System.out.println(monitorResolution);
        System.out.println(serialNumber);
        System.out.println(purchaseDate);
        System.out.println(desktopLocation);
		
		System.out.println();
		
		
	desktopId = "DT123456";
    desktopBrand = "Dell";
    processorModel = "Intel Core i7-12700";   
    ramSizeGB = 16;
    storageSizeGB = 512;
    storageType = "SSD";
    graphicsCard = "NVIDIA GTX 1660";
    operatingSystem = "Windows 11 Pro";
    motherboardModel = "ASUS Prime B660M-A";
    hasWiFi = true;
    hasBluetooth = true;
    usbPortCount = 6;
    powerSupply = "500W PSU";
    monitorBrand = "LG";
    monitorSizeInches = 24;
	monitorResolution = "1920x1080";
	serialNumber = "SNDT0987654321";
	purchaseDate = "2023-11-01";
    desktopLocation = "IT Department - Floor 2";
	
		
        System.out.println("=== Desktop Information ===");
        System.out.println("Desktop ID: " + desktopId);
        System.out.println("Brand: " + desktopBrand);
        System.out.println("Processor: " + processorModel);
        System.out.println("RAM Size: " + ramSizeGB + " GB");
        System.out.println("Storage Size: " + storageSizeGB + " GB");
        System.out.println("Storage Type: " + storageType);
        System.out.println("Graphics Card: " + graphicsCard);
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Motherboard: " + motherboardModel);
        System.out.println("WiFi Enabled: " + hasWiFi);
        System.out.println("Bluetooth Enabled: " + hasBluetooth);
        System.out.println("USB Ports: " + usbPortCount);
        System.out.println("Power Supply: " + powerSupply);
        System.out.println("Monitor Brand: " + monitorBrand);
        System.out.println("Monitor Size: " + monitorSizeInches + " inches");
        System.out.println("Monitor Resolution: " + monitorResolution);
        System.out.println("Serial Number: " + serialNumber);
        System.out.println("Purchase Date: " + purchaseDate);
        System.out.println("Location: " + desktopLocation);
    }
}
