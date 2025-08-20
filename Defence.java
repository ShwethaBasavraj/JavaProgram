class Defence {
    String defenceName;
    String location;
    int noOfArmies;
    String operationHours;
    Army army;
    
    Defence() {
        
    }
    
    Defence(String defenceName, String location, int noOfArmies, String operationHours, Army army) {
        this.defenceName = defenceName;
        this.location = location;
        this.noOfArmies = noOfArmies;
        this.operationHours = operationHours;
        this.army = army;
    }
    
    public void getLibraryInfo() {
        System.out.println("Defence Information :");
        System.out.println();
        System.out.println("Defence Name :" + defenceName);
        System.out.println("Defence Location :" + location);
        System.out.println("Number of Armies :" + noOfArmies);
        System.out.println("Operation Hours :" + operationHours);
        System.out.println();
        
        this.army.getShelfInfo();
    }
}