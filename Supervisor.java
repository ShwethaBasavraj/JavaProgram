class Supervisor {
    public static void approve(String reportType, String reportPeriod, String department) {
        System.out.println("Supervisor approved the analysis.");
        Formatter.format(reportType, reportPeriod, department);
    }
}