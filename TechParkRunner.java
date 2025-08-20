class TechParkRunner {
    public static void main(String lib[]) {
        Company company = new Company();

        company.companyName = "Infosys";
        company.CEO = "Salil Parekh";
        company.noOfEmployees = 25000;
        company.industry = "IT Services";

        Block block = new Block("Block A", 50, 3, "Software", company);

        TechPark techPark = new TechPark("TechPark Manyata", "Bangalore", 10, "9:00 AM to 7:00 PM", block);

        techPark.getLibraryInfo();
    }
}
