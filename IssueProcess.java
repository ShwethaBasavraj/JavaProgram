class IssueProcess {
    public static void start(String employeeName, String laptopModel, String department) {
        System.out.println("Laptop issuance process has started.");
        ITDepartment.checkAvailability(employeeName, laptopModel, department);
        System.out.println("Laptop issuance process completed.");
    }
}
