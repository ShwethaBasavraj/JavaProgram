class Screen {
    int screenNumber;
    int totalSeats;
    boolean is3DEnabled;
    String soundSystem;
    Movie movie;

    Screen() {
    }

    Screen(int screenNumber, int totalSeats, boolean is3DEnabled, String soundSystem, Movie movie) {
        this.screenNumber = screenNumber;
        this.totalSeats = totalSeats;
        this.is3DEnabled = is3DEnabled;
        this.soundSystem = soundSystem;
        this.movie = movie;
    }

    public void getScreenInfo() {
        System.out.println("Screen Information:");
        System.out.println();
        System.out.println("Screen Number: " + screenNumber);
        System.out.println("Total Seats: " + totalSeats);
        System.out.println("3D Enabled: " + is3DEnabled);
        System.out.println("Sound System: " + soundSystem);
        System.out.println();

        this.movie.getMovieInfo();
    }
}