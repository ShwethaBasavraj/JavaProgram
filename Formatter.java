class Formatter {
    public static void format(String reportType, String reportPeriod, String department) {
        System.out.println("Formatter is formatting the report.");
        Delivery.send(reportType, reportPeriod, department);
    }
}