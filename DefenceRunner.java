class DefenceRunner {
    public static void main(String lib[]) {
        Squad squad = new Squad();
        
        squad.squadName = "Alpha";
        squad.squadLeader = "Captain John";
        squad.noOfSoldiers = 12;
        squad.role = "Reconnaissance";
        
        Army army = new Army("1st Infantry", 5, 3, "Infantry", squad);
        
        Defence defence = new Defence("Northern Command", "Chandimandir", 10, "24x7", army);
        
        defence.getLibraryInfo();
    }
}
