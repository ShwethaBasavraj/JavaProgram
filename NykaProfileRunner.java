class NykaProfileRunner {
    public static void main(String[] args) {

        boolean result = NykaaProfile.collectProfileDetails("Ritika Sharma", "ritika.sharma@example.com", 9876543210L,
																'F', "Combination", "Delhi", true);

        if (result) {
            NykaaProfile.getProfileInfo();
        } else {
            System.out.println("Failed to collect profile details.");
        }
    }
}
