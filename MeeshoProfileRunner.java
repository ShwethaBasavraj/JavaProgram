class MeeshoProfileRunner {
    public static void main(String[] args) {

        boolean result = MeeshoProfile.collectProfileDetails("Rahul Yadav", "rahul.yadav@meesho.com", 9812345678L,'M', "Reseller", "Lucknow", true);

        if (result) {
            MeeshoProfile.getProfileInfo();
        } else {
            System.out.println("Failed to collect Meesho profile details.");
        }
    }
}
