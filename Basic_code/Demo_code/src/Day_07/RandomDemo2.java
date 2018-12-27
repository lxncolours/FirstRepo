package Day_07;

import java.util.Random;

public class RandomDemo2 {
    public static void main(String[] args) {
        method(10);
        System.out.println("---------------");
        method(122313213);
        System.out.println("---------------");
        method(100000);
    }
    public static void method(int n){
        Random r = new Random();
        for (int i = 0; i < 120; i++) {
            int num = r.nextInt(n) + 1;
            System.out.println(num);
        }
    }
}
