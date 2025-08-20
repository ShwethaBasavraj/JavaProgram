class Ecommerce {
    String ecommerceName;
    String location;
    int noOfCategories;
    String workingHours;
    Category category;
    
    Ecommerce() {
        
    }
    
    Ecommerce(String ecommerceName, String location, int noOfCategories, String workingHours, Category category) {
        this.ecommerceName = ecommerceName;
        this.location = location;
        this.noOfCategories = noOfCategories;
        this.workingHours = workingHours;
        this.category = category;
    }
    
    public void getLibraryInfo() {
        System.out.println("Ecommerce Information :");
        System.out.println();
        System.out.println("Ecommerce Name :" + ecommerceName);
        System.out.println("Location :" + location);
        System.out.println("Number of Categories :" + noOfCategories);
        System.out.println("Working Hours :" + workingHours);
        System.out.println();
        
        this.category.getShelfInfo();
    }
}
