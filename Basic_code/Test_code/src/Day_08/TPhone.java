package Day_08;

public class TPhone {
    private String brand;
    private int price;
    private int years;

    public TPhone() {
    }

    public TPhone(String brand, int price, int years) {
        this.brand = brand;
        this.price = price;
        this.years = years;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
