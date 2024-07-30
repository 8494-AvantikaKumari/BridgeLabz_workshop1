import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void checkout() {
        // Here you can implement the checkout process
        System.out.println("Checking out. Total price: " + getTotalPrice());
        products.clear();
    }

    public List<Product> getProducts() {
        return new ArrayList<>(products);
    }
}

