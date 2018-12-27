package Day_04;

public class MethodTest02 {
    public static void main(String[] args) {
        int sum = sum(1, 100);//对偶数求和方法赋值调用
        System.out.println(sum(0, 100)); //对偶数求和方法打印调用
        int sum1 = sum1(323,898778007);//对奇数求和方法赋值调用
        System.out.println("sum1 = " + sum1);
    }
    //使用方法求两数之间的偶数和
    public static int sum(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    //使用方法求两数之间的奇数和
    public static int sum1(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void print(int a){
        for (int i = 0; i < a; i++) {
        System.out.println("HelloWorld"+ a);
        }
    }
}
