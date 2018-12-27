package Day_10.Test07;

public class KeyBoard implements USB{
    @Override
    public void open() {
        System.out.println("键盘现在可以使用了");
    }

    @Override
    public void close() {
        System.out.println("键盘现在不能使用了");
    }

    void knock(){
        System.out.println("键盘可以敲击");
    }
}
