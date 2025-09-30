package present;

public class Clothing extends Product {

    public Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double finalPrice() {
        return super.finalPrice();
    }

    @Override
    public String toString() {
        return getName() + " (Clothing) | Harga akhir: " + finalPrice();
    }
}
