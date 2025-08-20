class Meeting {
    String meetingTitle;
    String meetingDate;
    String meetingTime;
    int durationMinutes;
    Invitee invitee;

    Meeting() {
    }

    Meeting(String meetingTitle, String meetingDate, String meetingTime, int durationMinutes, Invitee invitee) {
        this.meetingTitle = meetingTitle;
        this.meetingDate = meetingDate;
        this.meetingTime = meetingTime;
        this.durationMinutes = durationMinutes;
        this.invitee = invitee;
    }

    public void getMeetingInfo() {
        System.out.println("Meeting Information:");
        System.out.println();
        System.out.println("Meeting Title: " + meetingTitle);
        System.out.println("Meeting Date: " + meetingDate);
        System.out.println("Meeting Time: " + meetingTime);
        System.out.println("Duration (minutes): " + durationMinutes);
        System.out.println();

        this.invitee.getInviteeInfo();
    }
}