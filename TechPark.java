class TechPark {
    String techParkName;
    String location;
    int noOfBlocks;
    String timing;
    Block block;
    
    TechPark() {
        
    }
    
    TechPark(String techParkName, String location, int noOfBlocks, String timing, Block block) {
        this.techParkName = techParkName;
        this.location = location;
        this.noOfBlocks = noOfBlocks;
        this.timing = timing;
        this.block = block;
    }
    
    public void getLibraryInfo() {
        System.out.println("TechPark Information :");
        System.out.println();
        System.out.println("TechPark Name :" + techParkName);
        System.out.println("TechPark Location :" + location);
        System.out.println("Number of Blocks :" + noOfBlocks);
        System.out.println("TechPark Timings :" + timing);
        System.out.println();
        
        this.block.getShelfInfo();
    }
}