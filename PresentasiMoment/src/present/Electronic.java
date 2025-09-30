package present;

public class Electronic extends Product {
    private double warrantyFee;

    public Electronic(String name, double price, double warrantyFee) {
        super(name, price);
        this.warrantyFee = warrantyFee;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() + warrantyFee;
    }

    @Override
    public String toString() {
        return getName() + " (Electronic) | Harga akhir: " + finalPrice();
    }
}
