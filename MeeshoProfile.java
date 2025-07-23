class MeeshoProfile {

    static String fullName;
    static String email;
    static long phoneNumber;      
    static char gender;           
    static String businessType;
    static boolean isVerifiedSeller;
    static String location;

    public static boolean collectProfileDetails(String name, String emailId, long phone, char userGender,
                                                String bizType, String userLocation, boolean isVerified) {

        boolean isProfileDetailsCollected = false;

        boolean nameValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean genderValid = false;
        boolean businessValid = false;
        boolean locationValid = false;

        if (name != null) {
            fullName = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the full name");
        }

        if (emailId != null) {
            email = emailId;
            emailValid = true;
        } else {
            System.out.println("Please enter the email");
        }

        if (phone > 0) {
            phoneNumber = phone;
            phoneValid = true;
        } else {
            System.out.println("Please enter a valid phone number");
        }

        if (userGender == 'M' || userGender == 'F' || userGender == 'O') {
            gender = userGender;
            genderValid = true;
        } else {
            System.out.println("Please enter gender as 'M', 'F', or 'O'");
        }

        if (bizType != null) {
            businessType = bizType;
            businessValid = true;
        } else {
            System.out.println("Please specify business type (e.g., Reseller, Manufacturer)");
        }

        if (userLocation != null) {
            location = userLocation;
            locationValid = true;
        } else {
            System.out.println("Please enter location");
        }

        isVerifiedSeller = isVerified;

        if (nameValid && emailValid && phoneValid && genderValid && businessValid && locationValid) {
            isProfileDetailsCollected = true;
        }

        return isProfileDetailsCollected;
    }

    public static void getProfileInfo() {
        System.out.println("Full Name         : " + fullName);
        System.out.println("Email             : " + email);
        System.out.println("Phone Number      : " + phoneNumber);
        System.out.println("Gender            : " + gender);
        System.out.println("Business Type     : " + businessType);
        System.out.println("Location          : " + location);
        System.out.println("Verified Seller?  : " + isVerifiedSeller);
    }
}
