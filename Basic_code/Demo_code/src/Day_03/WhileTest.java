package Day_03;

public class WhileTest {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i <= 100){
            if(i % 2 == 0){
                sum += i;
            }
            i++;
        }
        System.out.println("1到100之间偶数的和为" + sum);
    }
}
