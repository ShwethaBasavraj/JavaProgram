class MedicalShop {
    static int medecine;

    public static void main(String[] vote) {
        System.out.println("main started");
        addMedecine(40);
        System.out.println("Total medecine: " +""+medecine);
        System.out.println("main ended");
    }

    public static void addMedecine(int newMedecine) {
        System.out.println("medecine adding started");
        medecine = medecine + newMedecine;
        System.out.println("medecine adding ended");
    }
}
