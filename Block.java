class Block {
    String blockName;
    int noOfCompanies;
    int floorNO;
    String sector;
    Company company;
    
    Block() {
        
    }
    
    Block(String blockName, int noOfCompanies, int floorNO, String sector, Company company) {
        this.blockName = blockName;
        this.noOfCompanies = noOfCompanies;
        this.floorNO = floorNO;
        this.sector = sector;
        this.company = company;
    }
    
    public void getShelfInfo() {
        System.out.println("Block Information :");
        System.out.println();
        System.out.println("Number of Companies :" + noOfCompanies);
        System.out.println("Floor Number :" + floorNO);
        System.out.println("Sector :" + sector);
        System.out.println();
        
        this.company.getBookInfo();
    }
}
