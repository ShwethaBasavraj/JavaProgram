class DevelopmentCourse {
    static int topics;

    public static void main(String[] vote) {
        System.out.println("main started");
        newCar(10);
        System.out.println("Total topics: "+topics);
        System.out.println("main ended");
    }

    public static void nnewTopic(int topic) {
        System.out.println("topic adding started");
        topics = topics + topic;
        System.out.println("topic adding ended");
    }
}
