class Page {
    int pageNumber;
    int noOfArticles;
    String theme;
    Article article;

    Page() {
    }

    Page(int pageNumber, int noOfArticles, String theme, Article article) {
        this.pageNumber = pageNumber;
        this.noOfArticles = noOfArticles;
        this.theme = theme;
        this.article = article;
    }

    public void getPageInfo() {
        System.out.println("Page Information:");
        System.out.println();
        System.out.println("Page Number: " + pageNumber);
        System.out.println("Number of Articles: " + noOfArticles);
        System.out.println("Theme: " + theme);
        System.out.println();

        this.article.getArticleInfo();
    }
}