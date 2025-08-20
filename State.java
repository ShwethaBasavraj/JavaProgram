class State {
    String stateName;
    String governor;
    int numberOfDistricts;
    City city;

    State() {
    }

    State(String stateName, String governor, int numberOfDistricts, City city) {
        this.stateName = stateName;
        this.governor = governor;
        this.numberOfDistricts = numberOfDistricts;
        this.city = city;
    }

    public void getStateInfo() {
        System.out.println("State Information:");
        System.out.println();
        System.out.println("State Name: " + stateName);
        System.out.println("Governor: " + governor);
        System.out.println("Number of Districts: " + numberOfDistricts);
        System.out.println();

        this.city.getCityInfo();
    }
}