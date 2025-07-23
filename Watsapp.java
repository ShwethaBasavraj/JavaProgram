class Watsapp {
    static int status;

    public static void main(String[] args) {
        System.out.println("The main started");

        addStatus(21);

        System.out.println("The available status are " + status);
        System.out.println("The main ended");
    }

    public static void addStatus(int newStatus) {
        System.out.println("The adding status started");
        status = status + newStatus;
        System.out.println("The adding status ended");
    }
}
