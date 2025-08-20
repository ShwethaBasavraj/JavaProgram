class PmoRunner {
    public static void main(String[] args) {
        CabinetMinister minister = new CabinetMinister();
        minister.ministerName = "Arun Sharma";
        minister.ministry = "Finance";
        minister.yearsInOffice = 5;
        minister.currentStatus = "Active";

        PrimeMinister pm = new PrimeMinister("Ravi Kumar", 4, "Progressive Party", "Digital Transformation & Economic Growth", minister);

        Pmo pmo = new Pmo("Prime Minister's Office", "India", 300, "Chief Secretary", pm);

        pmo.getPmoInfo();
    }
}
