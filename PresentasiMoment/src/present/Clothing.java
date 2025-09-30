package present;

public class Clothing extends Product {
    private double discount;

    public Clothing(String name, double price, double discount) {
        super(name, price);
        this.discount = discount;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() - discount;
    }

    @Override
    public String toString() {
        return getName() + " (Clothing) | Harga akhir: " + finalPrice();
    }
}
