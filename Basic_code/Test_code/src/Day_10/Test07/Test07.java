package Day_10.Test07;
//进行描述笔记本类，实现笔记本使用USB鼠标、USB键盘
//    USB 接口，包含开启功能、关闭功能
//    笔记本类，包含运行功能、关机功能、使用 USB设备功能
//    鼠标类，要实现 USB接口，并具备点击的方法
//    键盘类，要实现 USB接口，具备敲击的方法
public class Test07 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.run();
        Mouse mouse = new Mouse();
        laptop.useUSB(mouse);
        KeyBoard keyBoard = new KeyBoard();
        laptop.useUSB(keyBoard);
        laptop.powerOff();
    }
}
