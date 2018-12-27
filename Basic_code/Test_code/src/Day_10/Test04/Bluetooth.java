package Day_10.Test04;

public interface Bluetooth {
    public abstract void btFunction();
    public default void connecting(){
        System.out.println("可以连接WIFI");
    }
}
