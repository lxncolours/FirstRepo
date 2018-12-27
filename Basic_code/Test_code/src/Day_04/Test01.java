package Day_04;

/*分析以下需求，并用代码实现(每个小题都要写成一个方法)
        1.求两个数据之和(整数 小数),在main方法中打印出来
        2.判断两个数据是否相等(整数 小数),在控制台上打印出来
        3.获取两个数中较大的值(整数 小数),在控制台上打印出来
        4.获取两个数中较小的值(整数 整数),在main方法中打印出来*/
public class Test01 {
    public static void main(String[] args) {
        System.out.println(sum(21321, 12312.122));
        System.out.println(min(33, 44));
        xiangdeng(222, 333);
        max(23213, 123213);
    }

    public static double sum(int a, double b) {
        return a + b;
    }

    public static void xiangdeng(int a, double b) {
        if (a == b) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void max(int a, double b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static int min(int a, int b) {
        return a > b ? b : a;
    }
}
