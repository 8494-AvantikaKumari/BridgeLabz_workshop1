public class Electronics extends Product{
     private String brand;
     private int warrenty;

    public String getBrand() {
        return brand;
    }

    public int getWarrenty() {
        return warrenty;
    }

    public Electronics(int productId, String name, double price , String brand){
         super(productId,name,price);
         this.brand=brand;
         this.warrenty=warrenty;
     }
}
