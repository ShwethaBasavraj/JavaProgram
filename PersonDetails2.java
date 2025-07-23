public class PersonDetails2 {

    static byte age;
    static short birthYear;
    static int id;
    static long phoneNumber;
    static float height;
    static double weight;
    static char gender;
    static boolean isMarried;
    static String name;

    public static byte getAge() {
        age = 28;
        return age;
    }

    public static short getBirthYear() {
        birthYear = 1996;
        return birthYear;
    }

    public static int getId() {
        id = 1001;
        return id;
    }

    public static long getPhoneNumber() {
        phoneNumber = 9876543210L;
        return phoneNumber;
    }

    public static float getHeight() {
        height = 5.8f;
        return height;
    }

    public static double getWeight() {
        weight = 68.5;
        return weight;
    }

    public static char getGender() {
        gender = 'F';
        return gender;
    }

    public static boolean isMarried() {
        isMarried = true;
        return isMarried;
    }

    public static String getName() {
        name = "Benki";
        return name;
    }
	

}
