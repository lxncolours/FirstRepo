package Day_07;

import java.util.Random;

public class RandowDemo {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            if (i % 5 == 0){
                System.out.println();
            }
            System.out.print(r.nextInt(100)+"   ");

        }
    }
}
