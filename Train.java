class Train {
    String trainName;
    int trainNumber;
    String route;
    String departureTime;
    Coach coach;

    Train() {

    }

    Train(String trainName, int trainNumber, String route, String departureTime, Coach coach) {
        this.trainName = trainName;
        this.trainNumber = trainNumber;
        this.route = route;
        this.departureTime = departureTime;
        this.coach = coach;
    }

    public void getTrainInfo() {
        System.out.println("Train Information:");
        System.out.println();
        System.out.println("Train Name: " + trainName);
        System.out.println("Train Number: " + trainNumber);
        System.out.println("Route: " + route);
        System.out.println("Departure Time: " + departureTime);
        System.out.println();

        this.coach.getCoachInfo();
    }
}
