class Invitee {
    String name;
    String email;
    boolean hasAccepted;

    Invitee() {
    }

    Invitee(String name, String email, boolean hasAccepted) {
        this.name = name;
        this.email = email;
        this.hasAccepted = hasAccepted;
    }

    public void getInviteeInfo() {
        System.out.println("Invitee Information:");
        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Has Accepted: " + hasAccepted);
        System.out.println();
    }
}