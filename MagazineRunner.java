class MagazineRunner {
    public static void main(String[] args) {
        Article article = new Article();
        article.title = "The Future of AI";
        article.author = "Jane Doe";
        article.wordCount = 1500;

        Page page = new Page(5, 3, "Technology", article);

        Magazine magazine = new Magazine("Tech Today", "Future Media", 100, "July 2025", page);

        magazine.getMagazineInfo();
    }
}
