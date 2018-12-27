package Day_09.Test04Demo;

public abstract class Phone {
    private String brand;

    public Phone() {
    }

    public Phone(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public abstract void playMusic(String s);
}
