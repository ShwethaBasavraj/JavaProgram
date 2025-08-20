class Contact {
    String contactName;
    String phoneNumber;
    String email;
    String address;
    
    Contact() {
        
    }
    
    Contact(String contactName, String phoneNumber, String email, String address) {
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    
    public void getContactInfo() {
        System.out.println("Contact Information :");
        System.out.println();
        System.out.println("Name : " + contactName);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Email : " + email);
        System.out.println("Address : " + address);
        System.out.println();
    }
}