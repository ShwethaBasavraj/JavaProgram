class CountryRunner {
    public static void main(String[] args) {
        City city = new City("Austin", 1000000, true);

        State state = new State("Texas", "Greg Abbott", 254, city);

        Country country = new Country("United States", "North America", 331000000L, state);

        country.getCountryInfo();
    }
}