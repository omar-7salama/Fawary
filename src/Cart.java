public class Cart {
    private Product product;
    private int quantity;

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void printItem() {
        System.out.println(quantity + "x " + product.getName() + "       " + product.getWeight());
    }
}
