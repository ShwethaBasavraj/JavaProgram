class Company {
    String companyName;
    String CEO;
    int noOfEmployees;
    String industry;
    
    public void getBookInfo() {
        System.out.println("Company Information :");
        System.out.println();
        System.out.println("Company Name :" + companyName);
        System.out.println("CEO :" + CEO);
        System.out.println("Number of Employees :" + noOfEmployees);
        System.out.println("Industry :" + industry);
        System.out.println();
    }
}