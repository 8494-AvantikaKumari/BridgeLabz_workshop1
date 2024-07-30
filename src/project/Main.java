public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product laptop = new Electronics(1, "Laptop", 1500.0, "Dell");
        Product tshirt = new Clothing(2, "T-Shirt", 20.0, "L", "Blue");

        cart.addProduct(laptop);
        cart.addProduct(tshirt);

        System.out.println("Total price in cart: " + cart.getTotalPrice());

        Order order = new Order(cart, "ORD123");
        order.placeOrder();
    }
}


