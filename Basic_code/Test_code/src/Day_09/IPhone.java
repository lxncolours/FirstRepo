package Day_09;

public class IPhone extends Phone {
    @Override
    void sendMessage() {
        System.out.println("发彩信");
    }

    @Override
    void playGame() {
        System.out.println("打王者荣耀");
    }

    void siri() {
        System.out.println("人工智障");
    }
}
