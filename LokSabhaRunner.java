class LokSabhaRunner {
    public static void main(String lib[]) {
        Politician politician = new Politician();
        
        politician.politicianName = "Narendra Modi";
        politician.party = "BJP";
        politician.yearsOfExperience = 20;
        politician.position = "Prime Minister";
        
        Seat seat = new Seat("Varanasi", 1500000, 1, "Uttar Pradesh", politician);
        
        LokSabha lokSabha = new LokSabha("17th LokSabha", "New Delhi", 543, "11:00 AM to 5:00 PM", seat);
        
        lokSabha.getLibraryInfo();
    }
}
