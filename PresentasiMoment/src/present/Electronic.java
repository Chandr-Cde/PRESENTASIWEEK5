package present;

public class Electronic extends Product {

    public Electronic(String name, double price) {
        super(name, price);
    }

    @Override
    public double finalPrice() {
        return super.finalPrice();
    }

    @Override
    public String toString() {
        return getName() + " (Electronic) | Harga akhir: " + finalPrice();
    }
}
