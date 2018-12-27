package Day_10.Test03;

public class Dog implements Animal{
    @Override
    public void run() {
        System.out.println("如脱缰的野狗一样奔跑");
    }
    public void eat(){
        System.out.println("狗吃屎");
    }
}
