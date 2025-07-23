class ManagerLap {
    public static void approve(String employeeName, String laptopModel, String department) {
        System.out.println("Manager has approved the laptop issuance.");
        ITPreparation.prepareLaptop(employeeName, laptopModel, department);
    }
}

