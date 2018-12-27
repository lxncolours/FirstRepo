package Day_04;

/*	1.定义两个变量代表长方形的长和宽
            定义方法计算该长方形的周长,并在main方法中打印周长
            2.定义两个变量代表长方形的长和宽
            定义方法计算该长方形的面积,并在main方法中打印面积
            3.定义一个变量代表圆的半径(π取3.14)
            定义方法计算该圆的周长,并在main方法中打印周长
            4.定义一个变量代表圆的半径(π取3.14)
            定义方法计算该圆的面积,并在main方法中打印面积*/
public class Test02 {
    public static void main(String[] args) {
        int chang = 10;
        int kuan = 20;
        int banjing = 10;
        System.out.println(zhouchang(chang, kuan));
        System.out.println(mianji(chang, kuan));
        System.out.println(yuanzhouchang(banjing));
        System.out.println(yuanmianji(banjing));
    }

    public static int zhouchang(int a, int b) {
        return (a + b) * 2;
    }

    public static int mianji(int a, int b) {
        return a * b;
    }

    public static double yuanzhouchang(int a) {
        return a * 3.14 * 2;
    }

    public static double yuanmianji(int a) {
        return a * a * 3.14;
    }
}
