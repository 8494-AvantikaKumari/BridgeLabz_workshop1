public class Order {
    private Cart cart;
    private String orderId;

    public Order(Cart cart, String orderId) {
        this.cart = cart;
        this.orderId = orderId;
    }

    public void placeOrder() {
        System.out.println("Order ID: " + orderId);
        cart.checkout();
    }

    public String getOrderId() {
        return orderId;
    }
}
