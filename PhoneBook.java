class PhoneBook {
    String phoneBookName;
    int totalContacts;
    Contact contact;
    
    PhoneBook() {
        
    }
    
    PhoneBook(String phoneBookName, int totalContacts, Contact contact) {
        this.phoneBookName = phoneBookName;
        this.totalContacts = totalContacts;
        this.contact = contact;
    }
    
    public void getPhoneBookInfo() {
        System.out.println("PhoneBook Information :");
        System.out.println();
        System.out.println("PhoneBook Name : " + phoneBookName);
        System.out.println("Total Contacts : " + totalContacts);
        System.out.println();
        
        this.contact.getContactInfo();
    }
}
