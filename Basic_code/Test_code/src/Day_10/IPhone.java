package Day_10;

public class IPhone implements Phone{
    @Override
    public void playGame() {
        System.out.println("打王者农药,吃鸡");
    }

    @Override
    public void sendMessage() {
        System.out.println("发彩信");
    }
}
