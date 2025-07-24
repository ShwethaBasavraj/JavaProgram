class VideoGame{

    // Static video game variables
    static String gameTitle = "Shadow Strike: Nexus";
    static String gameId = "GAME202506";
    static String developer = "Quantum Pixel Studios";
    static String publisher = "NovaCore Entertainment";

    static String releaseDate = "2025-05-10";
    static String genre = "Action RPG";
    static String gameMode = "Single Player & Multiplayer";

    static String platform = "PC, PlayStation 5, Xbox Series X";
    static boolean supportsCrossPlatform = true;
    static boolean hasOnlineMultiplayer = true;

    static int minRAMGB = 8;
    static int recommendedRAMGB = 16;
    static String minGraphicsCard = "NVIDIA GTX 1060";
    static String recommendedGraphicsCard = "NVIDIA RTX 3060";

    static double gameSizeGB = 45.7;
    static boolean hasInGamePurchases = true;
    static boolean hasControllerSupport = true;

    static String esrbRating = "Mature 17+";
    static String latestPatchVersion = "1.03";
    static String supportEmail = "support@shadowstrike.com";

    public static void main(String[] args) {
        // Output all static video game information
        System.out.println("=== Video Game Information ===");
        System.out.println("Game Title: " + gameTitle);
        System.out.println("Game ID: " + gameId);
        System.out.println("Developer: " + developer);
        System.out.println("Publisher: " + publisher);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Genre: " + genre);
        System.out.println("Game Mode: " + gameMode);
        System.out.println("Platform: " + platform);
        System.out.println("Cross-Platform Support: " + supportsCrossPlatform);
        System.out.println("Online Multiplayer: " + hasOnlineMultiplayer);
        System.out.println("Minimum RAM: " + minRAMGB + " GB");
        System.out.println("Recommended RAM: " + recommendedRAMGB + " GB");
        System.out.println("Minimum Graphics Card: " + minGraphicsCard);
        System.out.println("Recommended Graphics Card: " + recommendedGraphicsCard);
        System.out.println("Game Size: " + gameSizeGB + " GB");
        System.out.println("In-Game Purchases: " + hasInGamePurchases);
        System.out.println("Controller Support: " + hasControllerSupport);
        System.out.println("ESRB Rating: " + esrbRating);
        System.out.println("Latest Patch Version: " + latestPatchVersion);
        System.out.println("Support Email: " + supportEmail);
    }
}
