class FlipkartProfileRunner {
    public static void main(String[] args) {

        boolean result = FlipkartProfile.collectProfileDetails(
            "Amit Sharma", "amit.sharma@example.com", "9876543210",
            "Bengaluru, Karnataka", "Buyer", true, "2022-01-15"
        );

        if (result) {
            FlipkartProfile.getProfileInfo();
        } else {
            System.out.println("Failed to collect profile details.");
        }
    }
}
