public class Clothing extends Product{
    private String size;
    private String color;

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public Clothing(int productId, String name, double price, String size, String color){
        super(productId,name,price);
        this.size=size;
        this.color=color;
    }
}
