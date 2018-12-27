package Day_03;

public class Test03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 10 ==9 || i / 10 %10 ==9){
                continue;
            }
            System.out.println(i);
        }
    }
}
