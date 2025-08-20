class Article {
    String title;
    String author;
    int wordCount;

    public void getArticleInfo() {
        System.out.println("Article Information:");
        System.out.println();
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Word Count: " + wordCount);
        System.out.println();
    }
}