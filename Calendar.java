class Calendar {
    String calendarName;
    String owner;
    int totalMeetings;
    Meeting meeting;

    Calendar() {
    }

    Calendar(String calendarName, String owner, int totalMeetings, Meeting meeting) {
        this.calendarName = calendarName;
        this.owner = owner;
        this.totalMeetings = totalMeetings;
        this.meeting = meeting;
    }

    public void getCalendarInfo() {
        System.out.println("Calendar Information:");
        System.out.println();
        System.out.println("Calendar Name: " + calendarName);
        System.out.println("Owner: " + owner);
        System.out.println("Total Meetings: " + totalMeetings);
        System.out.println();

        this.meeting.getMeetingInfo();
    }
}
