import java.util.Scanner;

public class Product {
    private String name;
    private double price;
    private int quantity;
    private boolean isShipped;
    private double weight;
    private boolean hasExpiry;
    private String expDate;

    Scanner scanner = new Scanner(System.in);

    public Product(String name, double price, int quantity, boolean isShipped, boolean hasExpiry) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isShipped = isShipped;
        this.hasExpiry = hasExpiry;

        checkShipping();
        checkExpiry();
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isShipped() {
        return isShipped;
    }

    public double getWeight() {
        return weight;
    }

    public String getExpDate() {
        return expDate;
    }

    public boolean isHasExpiry() {
        return hasExpiry;
    }

    public void reduceQuantity(int amount) {
        if (amount > quantity) {
            System.out.println("Not enough stock!");
        } else {
            quantity -= amount;
        }
    }

    public void checkShipping() {
        if (isShipped) {
            System.out.print("Enter the product weight in kg " + getName() + ":" );
            this.weight = scanner.nextDouble();
        }
    }

    public void checkExpiry() {
        if (hasExpiry) {
            System.out.print("Enter expiry date For " + getName() + ":" );
            scanner.nextLine();
            this.expDate = scanner.nextLine();
        }
    }

    public void printDetails() {
        System.out.println("--- Product Details ---");
        System.out.println("Name: " + getName());
        System.out.println("Price: " + getPrice());
        System.out.println("Quantity: " + getQuantity());

        if (isShipped) {
            System.out.println("Weight: " + getWeight() + "kg");
        }

        if (hasExpiry) {
            System.out.println("Expiry Date: " + getExpDate());
        }
    }

}
