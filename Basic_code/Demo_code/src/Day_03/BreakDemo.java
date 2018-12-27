package Day_03;

public class BreakDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue;//如果i为偶数则直接跳过后面的代码,重新执行循环
            }
            System.out.println("HelloWorld");
        }
    }
}
