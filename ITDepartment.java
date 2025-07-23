class ITDepartment {
    public static void checkAvailability(String employeeName, String laptopModel, String department) {
        System.out.println("IT Department is checking laptop availability...");
        ManagerLap.approve(employeeName, laptopModel, department);
    }
}
