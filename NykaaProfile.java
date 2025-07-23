class NykaaProfile {

    static String fullName;
    static String email;
    static long phoneNumber;      
    static char gender;            
    static String skinType;
    static boolean isNykaaPriveMember;
    static String location;

    public static boolean collectProfileDetails(String name, String emailId, long phone, char userGender,
                                                String userSkinType, String userLocation, boolean isPriveMember) {

        boolean isProfileDetailsCollected = false;

        boolean nameValid = false;
        boolean emailValid = false;
        boolean phoneValid = false;
        boolean genderValid = false;
        boolean skinTypeValid = false;
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

        if (userGender == 'M' || userGender == 'F') {
            gender = userGender;
            genderValid = true;
        } else {
            System.out.println("Please enter gender as 'M' or 'F'");
        }

        if (userSkinType != null) {
            skinType = userSkinType;
            skinTypeValid = true;
        } else {
            System.out.println("Please specify skin type");
        }

        if (userLocation != null) {
            location = userLocation;
            locationValid = true;
        } else {
            System.out.println("Please enter location");
        }

        isNykaaPriveMember = isPriveMember;

        if (nameValid && emailValid && phoneValid && genderValid && skinTypeValid && locationValid) {
            isProfileDetailsCollected = true;
        }

        return isProfileDetailsCollected;
    }

	public static void getProfileInfo() {
        System.out.println("Full Name           : " + fullName);
        System.out.println("Email               : " + email);
        System.out.println("Phone Number        : " + phoneNumber);
        System.out.println("Gender              : " + gender);
        System.out.println("Skin Type           : " + skinType);
        System.out.println("Location            : " + location);
        System.out.println("Nykaa Prive Member? : " + isNykaaPriveMember);
    }
}
