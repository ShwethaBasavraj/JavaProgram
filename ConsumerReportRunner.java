class ConsumerReportRunner {
    public static void main(String args[]) {
        String reportType = "Monthly Sales Report";
        String reportPeriod = "June 2025";
        String department = "Electronics";

        ReportProcess.start(reportType, reportPeriod, department);
    }
}