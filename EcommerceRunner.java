class EcommerceRunner {
    public static void main(String lib[]) {
        Product product = new Product();
        
        product.productName = "Smartphone";
        product.brand = "XYZ";
        product.price = 29999.99;
        product.availability = "In Stock";
        
        Category category = new Category("Electronics", 150, 101, "Gadgets", product);
        
        Ecommerce ecommerce = new Ecommerce("ShopEase", "Bangalore", 10, "9 AM to 9 PM", category);
        
        ecommerce.getLibraryInfo();
    }
}
