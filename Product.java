class Product {
    String productName;
    String brand;
    double price;
    String availability;
    
    public void getBookInfo() {
        System.out.println("Product Information :");
        System.out.println();
        System.out.println("Product Name :" + productName);
        System.out.println("Brand :" + brand);
        System.out.println("Price :" + price);
        System.out.println("Availability :" + availability);
        System.out.println();
    }
}