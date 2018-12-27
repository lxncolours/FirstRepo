package Day_10.Test03;

public interface Animal {
    public abstract void run();
    public default void sleep(){
        System.out.println("动物会休息");
    }
}
