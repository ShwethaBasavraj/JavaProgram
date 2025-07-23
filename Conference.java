class Conference {
    static int attendees;

    public static void main(String[] args) {
        System.out.println("main started");
        totalAttendees(250);
        System.out.println("Total attendees: " + attendees);
        System.out.println("main ended");
    }

    public static void totalAttendees(int attendees) {
        System.out.println("attendees adding started");
        attendees = attendees + attendees;
        System.out.println("attendees adding ended");
    }
}
