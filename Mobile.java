class Mobile {
    String mobileBrand;
    String model;
    String osVersion;
    int storageGB;
    PhoneBook phoneBook;
    
    Mobile() {
        
    }
    
    Mobile(String mobileBrand, String model, String osVersion, int storageGB, PhoneBook phoneBook) {
        this.mobileBrand = mobileBrand;
        this.model = model;
        this.osVersion = osVersion;
        this.storageGB = storageGB;
        this.phoneBook = phoneBook;
    }
    
    public void getMobileInfo() {
        System.out.println("Mobile Information :");
        System.out.println();
        System.out.println("Brand : " + mobileBrand);
        System.out.println("Model : " + model);
        System.out.println("OS Version : " + osVersion);
        System.out.println("Storage (GB) : " + storageGB);
        System.out.println();
        
        this.phoneBook.getPhoneBookInfo();
    }
}
