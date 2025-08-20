class Army {
    String armyName;
    int noOfSquads;
    int divisionNo;
    String specialty;
    Squad squad;
    
    Army() {
        
    }
    
    Army(String armyName, int noOfSquads, int divisionNo, String specialty, Squad squad) {
        this.armyName = armyName;
        this.noOfSquads = noOfSquads;
        this.divisionNo = divisionNo;
        this.specialty = specialty;
        this.squad = squad;
    }
    
    public void getShelfInfo() {
        System.out.println("Army Information :");
        System.out.println();
        System.out.println("Number of Squads :" + noOfSquads);
        System.out.println("Division Number :" + divisionNo);
        System.out.println("Specialty :" + specialty);
        System.out.println();
        
        this.squad.getBookInfo();
    }
}
