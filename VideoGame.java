class VideoGame{

    static String gameTitle;
    static long gameId;
    static String developer;
    static String publisher;
	static String releaseDate;
    static String genre;
    static String gameMode ;
	static String platform;
    static boolean supportsCrossPlatform;
    static boolean hasOnlineMultiplayer ;
	static int minRAMGB;
    static int recommendedRAMGB ;
    static String minGraphicsCard ;
    static String recommendedGraphicsCard;
	static double gameSizeGB;
    static boolean hasInGamePurchases;
    static boolean hasControllerSupport;
	static String esrbRating;
    static double latestPatchVersion;
    static String supportEmail;

    public static void main(String[] args) {
        
        System.out.println("=== Video Game Information ===");
        System.out.println(gameTitle);
        System.out.println(gameId);
        System.out.println(developer);
        System.out.println(rpublisher);
        System.out.println(eleaseDate);
        System.out.println(genre);
        System.out.println(gameMode);
        System.out.println(platform);
        System.out.println(supportsCrossPlatform);
        System.out.println( hasOnlineMultiplayer);
        System.out.println(minRAMGB + " GB");
        System.out.println(recommendedRAMGB + " GB");
        System.out.println("minGraphicsCard);
        System.out.println(recommendedGraphicsCard);
        System.out.println(gameSizeGB + " GB");
        System.out.println(hasInGamePurchases);
        System.out.println(hasControllerSupport);
        System.out.println(esrbRating);
        System.out.println(latestPatchVersion);
        System.out.println(supportEmail);
		
		
		 System.out.println();
	
	gameTitle = "PUBG";
    gameId = 123698741;
    developer = "PUBG Studios";
    publisher = "KRAFTON";
	releaseDate = "2023-03-23";
    genre = "Player vs Player Shooter";
    gameMode = "War";
    platform = "PC,Mobile";
    supportsCrossPlatform = true;
    hasOnlineMultiplayer = true;
	minRAMGB = 8;
    recommendedRAMGB = 16;
    minGraphicsCard = "NVIDIA GTX 1060";
    recommendedGraphicsCard = "NVIDIA RTX 3060";
	gameSizeGB = 45.7;
    hasInGamePurchases = true;
    hasControllerSupport = true;
	esrbRating = "Mature 17+";
    latestPatchVersion = 1.03;
    supportEmail = "support@pubg.com";
	
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
