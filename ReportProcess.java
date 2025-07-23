class ReportProcess {
    public static void start(String reportType, String reportPeriod, String department) {
        System.out.println("The process to generate consumer report has started.");
        Analyst.analyze(reportType, reportPeriod, department);
        System.out.println("Consumer report process completed.");
    }
}
