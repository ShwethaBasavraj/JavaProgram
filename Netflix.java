class Netflix {

    static String kannadaMovies[] = {
        "KGF", "Kantara", "MungaruMale", "OM", "A", "KGF2", "Gaja", "Appu", "IntiNinnaPritiya", "Rajkumar"
    };

    static String webSeries[] = {
        "Sacred Games", "Mirzapur", "Paatal Lok", "Criminal Justice", "Wednesday", "Software Developer", 
        "Surya", "Breathe", "Delhi Crime", "Black Warrant"
    };

    static String englishMovies[] = {
        "The Godfather", "The Shawshank Redemption", "The Dark Knight", "Pulp Fiction", "Forrest Gump",
        "Inception", "Fight Club", "Goodfellas", "Schindler's List", "The Return of the King"
    };

    static String hindiMovies[] = {
        "Dangal", "3 Idiots", "Lagaan", "Swades", "Chak De India", "Munna Bhai M.B.B.S.", 
        "Dil Chahta Hai", "Gangs of Wasseypur", "Andhadhun"
    };

    static String malayalamMovies[] = {
        "Drishyam", "Ustad Hotel", "Bangalore Days", "Manjummel Boys", "Pranchiyettan And The Saint", 
        "Aavesham", "Kumbalangi Nights", "Manichitrathazhu", "Namukku Parkkan Munthirithoppukal", "Darshanam"
    };

    static String teluguMovies[] = {
        "RRR", "100% Love", "Sita Ramam", "Thandal", "Gota Govindam", "Pakka Local Boy", 
        "Hai Nanna", "Bahubali-1", "Bahubali-2", "Fidha"
    };

    static String tamilMovies[] = {
        "Nayakan", "Thalapathi", "Vikram Vedha", "Anbe Sivam", "Baasha", "Iruvar", 
        "Jigarthanda", "Kaithi", "Pariyerum Perumal", "Soorarai Pottru"
    };

    static String koreanMovies[] = {
        "Parasite", "Oldboy", "Train to Busan", "Handmaiden", "Memories of Murder", 
        "Burning", "I Saw the Devil", "The Wailing", "The Man from Nowhere", "A Tale of Two Sisters"
    };

    public static void main(String movies[]) {

        System.out.println("main started\n");

        System.out.println("The available Kannada movies are:");
        for (String movie : kannadaMovies)
            System.out.println(movie);
        System.out.println();

        System.out.println("The available Web Series are:");
        for (String series : webSeries)
            System.out.println(series);
        System.out.println();

        System.out.println("The available English movies are:");
        for (String movie : englishMovies)
            System.out.println(movie);
        System.out.println();

        System.out.println("The available Hindi movies are:");
        for (String movie : hindiMovies)
            System.out.println(movie);
        System.out.println();

        System.out.println("The available Malayalam movies are:");
        for (String movie : malayalamMovies)
            System.out.println(movie);
        System.out.println();

        System.out.println("The available Telugu movies are:");
        for (String movie : teluguMovies)
            System.out.println(movie);
        System.out.println();

        System.out.println("The available Tamil movies are:");
        for (String movie : tamilMovies)
            System.out.println(movie);
        System.out.println();

        System.out.println("The available Korean movies are:");
        for (String movie : koreanMovies)
            System.out.println(movie);
        System.out.println();

        System.out.println("main ended");
    }
}
