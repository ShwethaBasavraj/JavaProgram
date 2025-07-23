class FlipkartProfile {

    static String username;
    static String email;
    static String mobileNumber;
    static String address;
    static String userType; 
    static boolean isPrimeMember;
    static String accountCreatedDate;

    public static boolean collectProfileDetails(String name, String emailId, String mobile, String userAddress,
                                                String type, boolean primeMember, String createdDate) {

        boolean isProfileDetailsCollected = false;

        boolean nameValid = false;
        boolean emailValid = false;
        boolean mobileValid = false;
        boolean addressValid = false;
        boolean typeValid = false;
        boolean dateValid = false;

        if (name != null) {
            username = name;
            nameValid = true;
        } else {
            System.out.println("Please enter the username");
        }

        if (emailId != null) {
            email = emailId;
            emailValid = true;
        } else {
            System.out.println("Please enter the email ID");
        }

        if (mobile != null) {
            mobileNumber = mobile;
            mobileValid = true;
        } else {
            System.out.println("Please enter the mobile number");
        }

        if (userAddress != null) {
            address = userAddress;
            addressValid = true;
        } else {
            System.out.println("Please enter the address");
        }

        if (type != null) {
            userType = type;
            typeValid = true;
        } else {
            System.out.println("Please specify if user is Buyer or Seller");
        }

        isPrimeMember = primeMember;

        if (createdDate != null) {
            accountCreatedDate = createdDate;
            dateValid = true;
        } else {
            System.out.println("Please enter the account created date");
        }

        if (nameValid && emailValid && mobileValid && addressValid && typeValid && dateValid) {
            isProfileDetailsCollected = true;
        }

        return isProfileDetailsCollected;
    }

    public static void getProfileInfo() {
        System.out.println("Username             : " + username);
        System.out.println("Email ID             : " + email);
        System.out.println("Mobile Number        : " + mobileNumber);
        System.out.println("Address              : " + address);
        System.out.println("User Type            : " + userType);
        System.out.println("Prime Member?        : " + isPrimeMember);
        System.out.println("Account Created Date : " + accountCreatedDate);
    }
}
