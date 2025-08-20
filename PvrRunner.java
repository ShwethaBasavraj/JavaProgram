class PvrRunner {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.movieName = "Inception";
        movie.genre = "Science Fiction";
        movie.durationMinutes = 148;

        Screen screen = new Screen(1, 120, true, "Dolby Atmos", movie);

        Pvr pvr = new Pvr("PVR Cinemas", "Bangalore", true, 5, 50, screen);

        pvr.getPvrInfo();
    }
}