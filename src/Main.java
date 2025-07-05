//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product Milk = new Product("Milk", 50, 20, true, true);
        Product biscuits = new Product("Biscuits", 150, 2, false, true);
        Product tv = new Product("TV", 300, 3, true, false);


        Customer customer = new Customer();


        customer.addToCart(tv, 2);
        customer.addToCart(biscuits, 1);
        customer.addToCart(Milk, 1);

        customer.printCart();
        customer.checkout();
        }
    }
