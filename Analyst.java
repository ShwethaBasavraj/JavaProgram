class Analyst {
    public static void analyze(String reportType, String reportPeriod, String department) {
        System.out.println("Analyst is analyzing data for the report...");
        Supervisor.approve(reportType, reportPeriod, department);
    }
}