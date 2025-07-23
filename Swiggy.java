class Swiggy  {
    public static double search(String foodName) {
        double price = 0.0;

        if (foodName == "Idli") {
            price = 30;
			return price;
        } else if (foodName == "Vada") {
            price = 20;
        } else if (foodName == "Masala Dosa") {
            price = 60;
        } else if (foodName == "Plain Dosa") {
            price = 45;
        } else if (foodName == "Rava Dosa") {
            price = 55;
        } else if (foodName == "Onion Uttapam") {
            price = 70;
        } else if (foodName == "Mini Idli Sambar") {
            price = 35;
        } else {
            System.out.println(price + " invalid ");
        }

        return price;
    }
	
	public static	double	search(String foodName , int quantity){
		
		 double price = 0.0;

        if (foodName == "Idli") {
            price = 30 * quantity;
			return price;
        } else if (foodName == "Vada") {
            price = 20 * quantity;
        } else if (foodName == "Masala Dosa") {
            price = 60 * quantity;
        } else if (foodName == "Plain Dosa") {
            price = 45 * quantity;
        } else if (foodName == "Rava Dosa") {
            price = 55 * quantity;
        } else if (foodName == "Onion Uttapam") {
            price = 70 * quantity;
        } else if (foodName == "Mini Idli Sambar") {
            price = 35 * quantity;
        } else {
            System.out.println(price + " invalid ");
        }
			return price;
	}
}