class Institute {
    static int students;

    public static void main(String[] vote) {
        System.out.println("main started");
        placedStudent(40);
        System.out.println("Total students: " +""+students);
        System.out.println("main ended");
    }

    public static void placedStudent(int newStudent) {
        System.out.println("Students adding started");
        students = students + newStudent;
        System.out.println("Students adding ended");
    }
}
