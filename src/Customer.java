import java.util.ArrayList;
public class Customer {
    public static final int cartSize = 10;

    private ArrayList<Cart> cart;


    public ArrayList<Cart> getCart() {
        return cart;
    }


    public Customer() {
        this.cart = new ArrayList<>(cartSize);
    }

    public void addToCart(Product product, int quantity) {
        if (cart.size() >= cartSize) {
            System.out.println("Cart is full! Max size = " + cartSize);
            return;
        }

        if (quantity > product.getQuantity()) {
            System.out.println("Not enough stock for " + product.getName());
            return;
        }

        cart.add(new Cart(product, quantity));
    }

    public void printCart() {
        System.out.println("--- Cart Items ---");
        for (Cart item : cart) {
            item.printItem();
        }
    }
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty. Cannot checkout.");
            return;
        }

        double subtotal = 0;
        double totalWeight = 0;

        System.out.println("\n** Checkout receipt **");

        for (Cart item : cart) {
            Product p = item.getProduct();
            int qty = item.getQuantity();

            double itemTotal = p.getPrice() * qty;
            subtotal += itemTotal;

            System.out.println(qty + "x " + p.getName());
            System.out.println(itemTotal);

            if (p.isShipped()) {
                totalWeight += p.getWeight() * qty;
            }

            p.reduceQuantity(qty);
        }
        System.out.println("Total package weight " + totalWeight + "kg");

        int shipping = 30;
        double total = subtotal + shipping;

        System.out.println("----------------------");
        System.out.println("Subtotal\t" + subtotal);
        System.out.println("Shipping\t" + shipping);
        System.out.println("Amount\t\t" + total);


    }


}

