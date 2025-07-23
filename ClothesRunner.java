class ClothesRunner{
    public static void main(String[] args) {
        boolean collected = Clothes.clothesDetailsCollecting("T-Shirt", "Blue", "M", "Nike", true);

        if (collected) {
            Clothes.getClothesInfo();
        } else {
            System.out.println("Clothes details are incomplete.");
        }
    }
}
