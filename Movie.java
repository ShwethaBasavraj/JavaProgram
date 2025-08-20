class Movie {
    String movieName;
    String genre;
    int durationMinutes;

    public void getMovieInfo() {
        System.out.println("Movie Information:");
        System.out.println();
        System.out.println("Movie Name: " + movieName);
        System.out.println("Genre: " + genre);
        System.out.println("Duration (in minutes): " + durationMinutes);
        System.out.println();
    }
}
