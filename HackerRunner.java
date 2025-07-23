class HackerRunner {
    public static void main(String[] args) {
        boolean collected = Hacker.hackerDetailsCollecting("ZeroCool", "Expert", "Python", "USA", false);

        if (collected) {
            Hacker.getHackerInfo();
        } else {
            System.out.println("Hacker details are incomplete.");
        }
    }
}
