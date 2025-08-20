class MobileRunner {
    public static void main(String[] args) {
        
        Contact contact = new Contact("John Doe", "123-456-7890", "john.doe@example.com", "123 Main St, Springfield");
        
        PhoneBook phoneBook = new PhoneBook("Personal Contacts", 1, contact);
        
        Mobile mobile = new Mobile("Samsung", "Galaxy S21", "Android 12", 128, phoneBook);
        
        mobile.getMobileInfo();
    }
}