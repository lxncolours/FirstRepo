package Day_09;

public class Phone {
    private String brand;
    private double price;
    private String type;


    public Phone() {
    }

    public Phone(String brand, double price, String type) {
        this.brand = brand;
        this.price = price;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public Phone(String type) {
        this.type = type;
    }

    void call() {
        System.out.println("打电话");
    }

    void sendMessage() {
        System.out.println("发短信");
    }

    void playGame() {
        System.out.println("玩游戏");
    }
}
