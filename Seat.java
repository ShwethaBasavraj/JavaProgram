class Seat {
    String seatName;
    int noOfVoters;
    int constituencyNo;
    String region;
    Politician politician;
    
    Seat() {
        
    }
    
    Seat(String seatName, int noOfVoters, int constituencyNo, String region, Politician politician) {
        this.seatName = seatName;
        this.noOfVoters = noOfVoters;
        this.constituencyNo = constituencyNo;
        this.region = region;
        this.politician = politician;
    }
    
    public void getShelfInfo() {
        System.out.println("Seat Information :");
        System.out.println();
        System.out.println("Number of Voters :" + noOfVoters);
        System.out.println("Constituency Number :" + constituencyNo);
        System.out.println("Region :" + region);
        System.out.println();
        
        this.politician.getBookInfo();
    }
}