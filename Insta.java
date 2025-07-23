class Insta {
    static int post;

    public static void main(String[] args) {
        System.out.println("The main started");

        newPost(20);

        System.out.println("The available post are " + post);
        System.out.println("The main ended");
    }

    public static void newPost(int addPost) {
        System.out.println("The adding newPost started");
        post = post + addPost;
        System.out.println("The adding newPost ended");
    }
}
