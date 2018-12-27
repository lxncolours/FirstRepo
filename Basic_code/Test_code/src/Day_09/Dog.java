package Day_09;

public class Dog extends Animal {
    @Override
     void eat(){
        System.out.println("狗要吃那啥");
    }
    @Override
    void run(){
        System.out.println("狗跑的如脱缰的野狗");
    }
    void cry(){
        System.out.println("狗会汪汪叫");
    }

}
