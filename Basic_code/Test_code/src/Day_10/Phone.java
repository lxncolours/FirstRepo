package Day_10;

public interface Phone {
    public abstract void playGame();

    public default void sendMessage() {
        System.out.println("发短信");
    }

    public static void call() {
        System.out.println("打电话");
    }

}
