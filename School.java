class School {
    static int addmission;

    public static void main(String[] add) {
        System.out.println("The main started");

        registeredStudent(80);

        System.out.println("The current registered Students are " + addmission);
        System.out.println("The main ended");
    }

    public static void registeredStudent(int newAddmission) {
        System.out.println("The addition started");
        addmission = addmission + newAddmission;
        System.out.println("The addition  ended");
    }
}
