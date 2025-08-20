class Category {
    String categoryName;
    int noOfProducts;
    int categoryId;
    String department;
    Product product;
    
    Category() {
        
    }
    
    Category(String categoryName, int noOfProducts, int categoryId, String department, Product product) {
        this.categoryName = categoryName;
        this.noOfProducts = noOfProducts;
        this.categoryId = categoryId;
        this.department = department;
        this.product = product;
    }
    
    public void getShelfInfo() {
        System.out.println("Category Information :");
        System.out.println();
        System.out.println("Number of Products :" + noOfProducts);
        System.out.println("Category ID :" + categoryId);
        System.out.println("Department :" + department);
        System.out.println();
        
        this.product.getBookInfo();
    }
}