 class Product {
    private int productId;
    private String name;
    private double price;

     public int getProductId() {
         return productId;
     }

     public String getName() {
         return name;
     }

     public double getPrice() {
         return price;
     }

     public Product(int productId, String Name, double price){
        this.productId=productId;
        this.name=name;
        this.price=price;


    }

}
