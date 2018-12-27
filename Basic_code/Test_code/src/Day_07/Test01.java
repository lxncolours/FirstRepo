package Day_07;
/*
1.键盘录入一个数，假如用户输入-1，就结束录入，
        否则就将录入的数据打印到控制台上，并提示用户再次录入。
*/

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        System.out.println("请输入一个数");
        Scanner sc = new Scanner(System.in);
        while (true) {
            int num = sc.nextInt();
            if (num == -1) {
                break;
            } else {
                System.out.println(num);
                System.out.println("请再次输入");
            }
        }
    }
}
