package Day_07;

import java.util.Scanner;

/*
6.模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果
        要求：
        (1)键盘录入三个整数,其中前两个整数代表参加运算的数据，
        第三个整数为要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)
        (2)演示格式如下:
        请输入第一个整数:30
        请输入第二个整数:40
        请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算):0
        控制台输出:30+40=70*/
public class Test06 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("请输入第一个整数");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            System.out.println("请输入第二个整数");
            int num2 = sc.nextInt();
            System.out.println("请输入您要进行的运算(0:表示加法运算,1:表示减法运算,2:表示乘法运算,3:表示除法运算)");
            int num3 = sc.nextInt();
            int result;
            switch (num3) {
                case 0:
                    result = num1 + num2;
                    System.out.println("result = " + result);
                    break;
                case 1:
                    result = num1 - num2;
                    System.out.println("result = " + result);
                    break;
                case 2:
                    result = num1 * num2;
                    System.out.println("result = " + result);
                    break;
                case 3:
                    result = num1 / num2;
                    System.out.println("result = " + result);
                    break;
                default:
                    System.out.println("请输入正确的数字");
                    break;
            }
        }

    }
}
