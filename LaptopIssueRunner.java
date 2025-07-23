class LaptopIssueRunner {
    public static void main(String args[]) {
        String employeeName = "John Doe";
        String laptopModel = "Dell Latitude 7440";
        String department = "Software Development";

        IssueProcess.start(employeeName, laptopModel, department);
    }
}
