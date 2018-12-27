package Day_10;

public interface Animal {
    public abstract void run();

    public default void breathe() {
        System.out.println("动物会呼吸");
        eat();
        sleep();
    }

    public static void eat() {
        System.out.println("动物都要吃东西");
    }

    private void sleep() {
        System.out.println("动物都要休息");
    }
}
