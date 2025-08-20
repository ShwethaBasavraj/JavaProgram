class Planet {
    String planetName;
    double radius; 
    boolean hasLife;

    Planet() {
    }

    Planet(String planetName, double radius, boolean hasLife) {
        this.planetName = planetName;
        this.radius = radius;
        this.hasLife = hasLife;
    }

    public void getPlanetInfo() {
        System.out.println("Planet Information:");
        System.out.println();
        System.out.println("Planet Name: " + planetName);
        System.out.println("Radius (km): " + radius);
        System.out.println("Supports Life: " + hasLife);
        System.out.println();
    }
}