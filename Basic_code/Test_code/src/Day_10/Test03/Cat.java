package Day_10.Test03;

public class Cat implements Animal {
    @Override
    public void run() {
        System.out.println("奔跑的猫毛都被撸秃了");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
