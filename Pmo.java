class Pmo {
    String officeName;
    String country;
    int totalStaff;
    String headOfOffice;
    PrimeMinister primeMinister;

    Pmo() {

    }

    Pmo(String officeName, String country, int totalStaff, String headOfOffice, PrimeMinister primeMinister) {
        this.officeName = officeName;
        this.country = country;
        this.totalStaff = totalStaff;
        this.headOfOffice = headOfOffice;
        this.primeMinister = primeMinister;
    }

    public void getPmoInfo() {
        System.out.println("PMO Information:");
        System.out.println();
        System.out.println("Office Name: " + officeName);
        System.out.println("Country: " + country);
        System.out.println("Total Staff: " + totalStaff);
        System.out.println("Head of Office: " + headOfOffice);
        System.out.println();

        this.primeMinister.getPrimeMinisterInfo();
    }
}
