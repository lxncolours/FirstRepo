package Day_04;

//	定义一个方法,该方法能求1-n的数据和
// 要求调用该方法,传入一个int类型的参数n
// 要求调用该方法,能返回1-n的和.并在主方法中打印出来
public class Test04 {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    public static int sum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
