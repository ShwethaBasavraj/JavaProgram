class ITPreparation {
    public static void prepareLaptop(String employeeName, String laptopModel, String department) {
        System.out.println("IT is preparing the laptop for issuance...");
        Employee.receiveLaptop(employeeName, laptopModel, department);
    }
}
