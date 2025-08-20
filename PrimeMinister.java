class PrimeMinister {
    String name;
    int term;
    String party;
    String achievements;
    CabinetMinister cabinetMinister;

    PrimeMinister() {

    }

    PrimeMinister(String name, int term, String party, String achievements, CabinetMinister cabinetMinister) {
        this.name = name;
        this.term = term;
        this.party = party;
        this.achievements = achievements;
        this.cabinetMinister = cabinetMinister;
    }

    public void getPrimeMinisterInfo() {
        System.out.println("Prime Minister Information:");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Term: " + term + " years");
        System.out.println("Party: " + party);
        System.out.println("Achievements: " + achievements);
        System.out.println();

        this.cabinetMinister.getMinisterInfo();
    }
}
