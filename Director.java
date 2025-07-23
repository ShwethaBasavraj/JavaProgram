class Director {
    public static void direct(String Hero, String Heroine, String Villan) {
        System.out.println("The Director started to direct the movie.");
        Artist.search(Hero, Heroine, Villan);
        System.out.println("The Director completed the direction.");
    }
}
