class City {
    String cityName;
    int population;
    boolean isCapital;

    City() {
    }

    City(String cityName, int population, boolean isCapital) {
        this.cityName = cityName;
        this.population = population;
        this.isCapital = isCapital;
    }

    public void getCityInfo() {
        System.out.println("City Information:");
        System.out.println();
        System.out.println("City Name: " + cityName);
        System.out.println("Population: " + population);
        System.out.println("Is Capital: " + isCapital);
        System.out.println();
    }
}
