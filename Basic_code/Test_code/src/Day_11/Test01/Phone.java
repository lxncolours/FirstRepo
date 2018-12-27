package Day_11.Test01;

public abstract class Phone {
    private String brand;
    private String price;

    public Phone() {
    }

    public Phone(String brand, String price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
    public abstract void sell();
}
