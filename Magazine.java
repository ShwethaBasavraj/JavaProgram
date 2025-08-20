class Magazine {
    String magazineName;
    String publisher;
    int noOfPages;
    String issueDate;
    Page page;

    Magazine() {
    }

    Magazine(String magazineName, String publisher, int noOfPages, String issueDate, Page page) {
        this.magazineName = magazineName;
        this.publisher = publisher;
        this.noOfPages = noOfPages;
        this.issueDate = issueDate;
        this.page = page;
    }

    public void getMagazineInfo() {
        System.out.println("Magazine Information:");
        System.out.println();
        System.out.println("Magazine Name: " + magazineName);
        System.out.println("Publisher: " + publisher);
        System.out.println("Number of Pages: " + noOfPages);
        System.out.println("Issue Date: " + issueDate);
        System.out.println();

        this.page.getPageInfo();
    }
}
