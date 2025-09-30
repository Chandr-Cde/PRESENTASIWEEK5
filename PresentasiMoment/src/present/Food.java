package present;

public class Food extends Product {

    public Food(String name, double price) {
        super(name, price);
    }

    @Override
    public double finalPrice() {
        return super.finalPrice();
    }

    @Override
    public String toString() {
        return getName() + " (Food) | Harga akhir: " + finalPrice();
    }
}
