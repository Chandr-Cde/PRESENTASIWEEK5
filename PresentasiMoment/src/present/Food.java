package present;

public class Food extends Product {
    private double tax;

    public Food(String name, double price, double tax) {
        super(name, price);
        this.tax = tax;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() + tax;
    }

    @Override
    public String toString() {
        return getName() + " (Food) | Harga akhir: " + finalPrice();
    }
}
