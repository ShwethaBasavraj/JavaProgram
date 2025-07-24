class CourtCaseRunner{

    public static void main(String args[]) {
        System.out.println("Court Case Program Started");

        // 1st
        CourtCase c1 = new CourtCase();
        c1.caseId = 1;
        c1.caseTitle = "State vs John";
        c1.caseType = "Criminal";
        c1.courtName = "High Court";
        c1.judgeName = "Justice Rao";
        c1.year = 2020;
        c1.isClosed = false;

        System.out.println("1st...");
        System.out.println("caseId: " + c1.caseId);
        System.out.println("caseTitle: " + c1.caseTitle);
        System.out.println("caseType: " + c1.caseType);
        System.out.println("courtName: " + c1.courtName);
        System.out.println("judgeName: " + c1.judgeName);
        System.out.println("year: " + c1.year);
        System.out.println("isClosed: " + c1.isClosed);
        System.out.println();

        // 2nd
        CourtCase c2 = new CourtCase();
        c2.caseId = 2;
        c2.caseTitle = "Meera vs Rakesh";
        c2.caseType = "Civil";
        c2.courtName = "District Court";
        c2.judgeName = "Justice Mehta";
        c2.year = 2019;
        c2.isClosed = true;

        System.out.println("2nd...");
        System.out.println("caseId: " + c2.caseId);
        System.out.println("caseTitle: " + c2.caseTitle);
        System.out.println("caseType: " + c2.caseType);
        System.out.println("courtName: " + c2.courtName);
        System.out.println("judgeName: " + c2.judgeName);
        System.out.println("year: " + c2.year);
        System.out.println("isClosed: " + c2.isClosed);
        System.out.println();

        // 3rd
        CourtCase c3 = new CourtCase();
        c3.caseId = 3;
        c3.caseTitle = "ABC Ltd vs XYZ Corp";
        c3.caseType = "Corporate";
        c3.courtName = "Supreme Court";
        c3.judgeName = "Justice Kumar";
        c3.year = 2021;
        c3.isClosed = false;

        System.out.println("3rd...");
        System.out.println("caseId: " + c3.caseId);
        System.out.println("caseTitle: " + c3.caseTitle);
        System.out.println("caseType: " + c3.caseType);
        System.out.println("courtName: " + c3.courtName);
        System.out.println("judgeName: " + c3.judgeName);
        System.out.println("year: " + c3.year);
        System.out.println("isClosed: " + c3.isClosed);
        System.out.println();

                // 4th
        CourtCase c4 = new CourtCase();
        c4.caseId = 4;
        c4.caseTitle = "People vs Singh";
        c4.caseType = "Criminal";
        c4.courtName = "Sessions Court";
        c4.judgeName = "Justice Verma";
        c4.year = 2022;
        c4.isClosed = false;

        System.out.println("4th...");
        System.out.println("caseId: " + c4.caseId);
        System.out.println("caseTitle: " + c4.caseTitle);
        System.out.println("caseType: " + c4.caseType);
        System.out.println("courtName: " + c4.courtName);
        System.out.println("judgeName: " + c4.judgeName);
        System.out.println("year: " + c4.year);
        System.out.println("isClosed: " + c4.isClosed);
        System.out.println();

        // 5th
        CourtCase c5 = new CourtCase();
        c5.caseId = 5;
        c5.caseTitle = "Kiran vs State";
        c5.caseType = "Appeal";
        c5.courtName = "High Court";
        c5.judgeName = "Justice Patil";
        c5.year = 2020;
        c5.isClosed = true;

        System.out.println("5th...");
        System.out.println("caseId: " + c5.caseId);
        System.out.println("caseTitle: " + c5.caseTitle);
        System.out.println("caseType: " + c5.caseType);
        System.out.println("courtName: " + c5.courtName);
        System.out.println("judgeName: " + c5.judgeName);
        System.out.println("year: " + c5.year);
        System.out.println("isClosed: " + c5.isClosed);
        System.out.println();

        // 6th
        CourtCase c6 = new CourtCase();
        c6.caseId = 6;
        c6.caseTitle = "Union vs Sharma";
        c6.caseType = "Labor";
        c6.courtName = "Labor Court";
        c6.judgeName = "Justice Iyer";
        c6.year = 2018;
        c6.isClosed = true;

        System.out.println("6th...");
        System.out.println("caseId: " + c6.caseId);
        System.out.println("caseTitle: " + c6.caseTitle);
        System.out.println("caseType: " + c6.caseType);
        System.out.println("courtName: " + c6.courtName);
        System.out.println("judgeName: " + c6.judgeName);
        System.out.println("year: " + c6.year);
        System.out.println("isClosed: " + c6.isClosed);
        System.out.println();

        // 7th
        CourtCase c7 = new CourtCase();
        c7.caseId = 7;
        c7.caseTitle = "Latha vs Prakash";
        c7.caseType = "Family";
        c7.courtName = "Family Court";
        c7.judgeName = "Justice Naik";
        c7.year = 2021;
        c7.isClosed = false;

        System.out.println("7th...");
        System.out.println("caseId: " + c7.caseId);
        System.out.println("caseTitle: " + c7.caseTitle);
        System.out.println("caseType: " + c7.caseType);
        System.out.println("courtName: " + c7.courtName);
        System.out.println("judgeName: " + c7.judgeName);
        System.out.println("year: " + c7.year);
        System.out.println("isClosed: " + c7.isClosed);
        System.out.println();

        // 8th
        CourtCase c8 = new CourtCase();
        c8.caseId = 8;
        c8.caseTitle = "Mohan vs Traffic Dept";
        c8.caseType = "Petition";
        c8.courtName = "Magistrate Court";
        c8.judgeName = "Justice Rao";
        c8.year = 2017;
        c8.isClosed = true;

        System.out.println("8th...");
        System.out.println("caseId: " + c8.caseId);
        System.out.println("caseTitle: " + c8.caseTitle);
        System.out.println("caseType: " + c8.caseType);
        System.out.println("courtName: " + c8.courtName);
        System.out.println("judgeName: " + c8.judgeName);
        System.out.println("year: " + c8.year);
        System.out.println("isClosed: " + c8.isClosed);
        System.out.println();

        // 9th
        CourtCase c9 = new CourtCase();
        c9.caseId = 9;
        c9.caseTitle = "Shweta vs CompanyX";
        c9.caseType = "Consumer";
        c9.courtName = "Consumer Court";
        c9.judgeName = "Justice Batra";
        c9.year = 2023;
        c9.isClosed = false;

        System.out.println("9th...");
        System.out.println("caseId: " + c9.caseId);
        System.out.println("caseTitle: " + c9.caseTitle);
        System.out.println("caseType: " + c9.caseType);
        System.out.println("courtName: " + c9.courtName);
        System.out.println("judgeName: " + c9.judgeName);
        System.out.println("year: " + c9.year);
        System.out.println("isClosed: " + c9.isClosed);
        System.out.println();

        // 10th
        CourtCase c10 = new CourtCase();
        c10.caseId = 10;
        c10.caseTitle = "Ali vs Govt";
        c10.caseType = "Constitutional";
        c10.courtName = "Supreme Court";
        c10.judgeName = "Justice Desai";
        c10.year = 2020;
        c10.isClosed = false;

        System.out.println("10th...");
        System.out.println("caseId: " + c10.caseId);
        System.out.println("caseTitle: " + c10.caseTitle);
        System.out.println("caseType: " + c10.caseType);
        System.out.println("courtName: " + c10.courtName);
        System.out.println("judgeName: " + c10.judgeName);
        System.out.println("year: " + c10.year);
        System.out.println("isClosed: " + c10.isClosed);
        System.out.println();

        // 11th
        CourtCase c11 = new CourtCase();
        c11.caseId = 11;
        c11.caseTitle = "Citizen Forum vs Corporation";
        c11.caseType = "Public Interest";
        c11.courtName = "High Court";
        c11.judgeName = "Justice Swamy";
        c11.year = 2019;
        c11.isClosed = true;

        System.out.println("11th...");
        System.out.println("caseId: " + c11.caseId);
        System.out.println("caseTitle: " + c11.caseTitle);
        System.out.println("caseType: " + c11.caseType);
        System.out.println("courtName: " + c11.courtName);
        System.out.println("judgeName: " + c11.judgeName);
        System.out.println("year: " + c11.year);
        System.out.println("isClosed: " + c11.isClosed);
        System.out.println();

        // 12th
        CourtCase c12 = new CourtCase();
        c12.caseId = 12;
        c12.caseTitle = "State vs Ravi";
        c12.caseType = "Criminal";
        c12.courtName = "Sessions Court";
        c12.judgeName = "Justice Chawla";
        c12.year = 2022;
        c12.isClosed = false;

        System.out.println("12th...");
        System.out.println("caseId: " + c12.caseId);
        System.out.println("caseTitle: " + c12.caseTitle);
        System.out.println("caseType: " + c12.caseType);
        System.out.println("courtName: " + c12.courtName);
        System.out.println("judgeName: " + c12.judgeName);
        System.out.println("year: " + c12.year);
        System.out.println("isClosed: " + c12.isClosed);
        System.out.println();

        // 13th
        CourtCase c13 = new CourtCase();
        c13.caseId = 13;
        c13.caseTitle = "Manju vs Lokesh";
        c13.caseType = "Family";
        c13.courtName = "Family Court";
        c13.judgeName = "Justice Arora";
        c13.year = 2018;
        c13.isClosed = true;

        System.out.println("13th...");
        System.out.println("caseId: " + c13.caseId);
        System.out.println("caseTitle: " + c13.caseTitle);
        System.out.println("caseType: " + c13.caseType);
        System.out.println("courtName: " + c13.courtName);
        System.out.println("judgeName: " + c13.judgeName);
        System.out.println("year: " + c13.year);
        System.out.println("isClosed: " + c13.isClosed);
        System.out.println();

        // 14th
        CourtCase c14 = new CourtCase();
        c14.caseId = 14;
        c14.caseTitle = "Traffic Dept vs Rakesh";
        c14.caseType = "Violation";
        c14.courtName = "Magistrate Court";
        c14.judgeName = "Justice Jain";
        c14.year = 2023;
        c14.isClosed = false;

        System.out.println("14th...");
        System.out.println("caseId: " + c14.caseId);
        System.out.println("caseTitle: " + c14.caseTitle);
        System.out.println("caseType: " + c14.caseType);
        System.out.println("courtName: " + c14.courtName);
        System.out.println("judgeName: " + c14.judgeName);
        System.out.println("year: " + c14.year);
        System.out.println("isClosed: " + c14.isClosed);
        System.out.println();

        // 15th
        CourtCase c15 = new CourtCase();
        c15.caseId = 15;
        c15.caseTitle = "NGO vs State";
        c15.caseType = "Environmental";
        c15.courtName = "Supreme Court";
        c15.judgeName = "Justice Pillai";
        c15.year = 2021;
        c15.isClosed = false;

        System.out.println("15th...");
        System.out.println("caseId: " + c15.caseId);
        System.out.println("caseTitle: " + c15.caseTitle);
        System.out.println("caseType: " + c15.caseType);
        System.out.println("courtName: " + c15.courtName);
        System.out.println("judgeName: " + c15.judgeName);
        System.out.println("year: " + c15.year);
        System.out.println("isClosed: " + c15.isClosed);
        System.out.println();

        // 16th
        CourtCase c16 = new CourtCase();
        c16.caseId = 16;
        c16.caseTitle = "Bank vs Raj";
        c16.caseType = "Banking";
        c16.courtName = "Debt Recovery Tribunal";
        c16.judgeName = "Justice Sharma";
        c16.year = 2020;
        c16.isClosed = true;

        System.out.println("16th...");
        System.out.println("caseId: " + c16.caseId);
        System.out.println("caseTitle: " + c16.caseTitle);
        System.out.println("caseType: " + c16.caseType);
        System.out.println("courtName: " + c16.courtName);
        System.out.println("judgeName: " + c16.judgeName);
        System.out.println("year: " + c16.year);
        System.out.println("isClosed: " + c16.isClosed);
        System.out.println();

        // 17th
        CourtCase c17 = new CourtCase();
        c17.caseId = 17;
        c17.caseTitle = "Advocate Bar vs Govt";
        c17.caseType = "Legal Reform";
        c17.courtName = "Supreme Court";
        c17.judgeName = "Justice Khan";
        c17.year = 2022;
        c17.isClosed = false;

        System.out.println("17th...");
        System.out.println("caseId: " + c17.caseId);
        System.out.println("caseTitle: " + c17.caseTitle);
        System.out.println("caseType: " + c17.caseType);
        System.out.println("courtName: " + c17.courtName);
        System.out.println("judgeName: " + c17.judgeName);
        System.out.println("year: " + c17.year);
        System.out.println("isClosed: " + c17.isClosed);
        System.out.println();

        // 18th
        CourtCase c18 = new CourtCase();
        c18.caseId = 18;
        c18.caseTitle = "Police Dept vs Contractor";
        c18.caseType = "Corruption";
        c18.courtName = "CBI Court";
        c18.judgeName = "Justice Thomas";
        c18.year = 2019;
        c18.isClosed = true;

        System.out.println("18th...");
        System.out.println("caseId: " + c18.caseId);
        System.out.println("caseTitle: " + c18.caseTitle);
        System.out.println("caseType: " + c18.caseType);
        System.out.println("courtName: " + c18.courtName);
        System.out.println("judgeName: " + c18.judgeName);
        System.out.println("year: " + c18.year);
        System.out.println("isClosed: " + c18.isClosed);
        System.out.println();

        // 19th
        CourtCase c19 = new CourtCase();
        c19.caseId = 19;
        c19.caseTitle = "Rahul vs Traffic Police";
        c19.caseType = "Traffic";
        c19.courtName = "Magistrate Court";
        c19.judgeName = "Justice Bhagat";
        c19.year = 2023;
        c19.isClosed = false;

        System.out.println("19th...");
        System.out.println("caseId: " + c19.caseId);
        System.out.println("caseTitle: " + c19.caseTitle);
        System.out.println("caseType: " + c19.caseType);
        System.out.println("courtName: " + c19.courtName);
        System.out.println("judgeName: " + c19.judgeName);
        System.out.println("year: " + c19.year);
        System.out.println("isClosed: " + c19.isClosed);
        System.out.println();

        // 20th
        CourtCase c20 = new CourtCase();
        c20.caseId = 20;
        c20.caseTitle = "Arjun vs Priya";
        c20.caseType = "Divorce";
        c20.courtName = "Family Court";
        c20.judgeName = "Justice Shetty";
        c20.year = 2021;
        c20.isClosed = true;

        System.out.println("20th...");
        System.out.println("caseId: " + c20.caseId);
        System.out.println("caseTitle: " + c20.caseTitle);
        System.out.println("caseType: " + c20.caseType);
        System.out.println("courtName: " + c20.courtName);
        System.out.println("judgeName: " + c20.judgeName);
        System.out.println("year: " + c20.year);
        System.out.println("isClosed: " + c20.isClosed);
        System.out.println();

        System.out.println("Court Case Program Ended");
    }
}

  