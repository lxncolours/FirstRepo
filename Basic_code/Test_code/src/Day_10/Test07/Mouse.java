package Day_10.Test07;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("红灯一闪,鼠标可以用了");
    }

    @Override
    public void close() {
        System.out.println("红灯一暗,鼠标用不了了");
    }

    void click(){
        System.out.println("鼠标可以点击");
    }
}
