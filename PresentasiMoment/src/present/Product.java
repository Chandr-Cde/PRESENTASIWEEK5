package present;

public class Product {
    String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    public double finalPrice() { return price; }

    @Override
    public String toString() {
        return name + " | Harga akhir: " + finalPrice();
    }
}
