class VotingSystem {
    static int votes;

    public static void main(String[] vote) {
        System.out.println("main started");
        castVote(200);
        System.out.println("Total votes: " +""+votes);
        System.out.println("main ended");
    }

    public static void castVote(int newVotes) {
        System.out.println("Casting vote");
        votes = votes + newVotes;
        System.out.println("Vote cast");
    }
}
