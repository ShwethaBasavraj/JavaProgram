class Country {
    String countryName;
    String continent;
    long population;
    State state;

    Country() {
    }

    Country(String countryName, String continent, long population, State state) {
        this.countryName = countryName;
        this.continent = continent;
        this.population = population;
        this.state = state;
    }

    public void getCountryInfo() {
        System.out.println("Country Information:");
        System.out.println();
        System.out.println("Country Name: " + countryName);
        System.out.println("Continent: " + continent);
        System.out.println("Population: " + population);
        System.out.println();

        this.state.getStateInfo();
    }
}