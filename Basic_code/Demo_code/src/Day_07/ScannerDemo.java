package Day_07;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数");
        int b = sc.nextInt();
        System.out.println("请输入第三个整数");
        int c = sc.nextInt();
        if (a > b) {
            if (a > c){
                System.out.println("最大值为" + a);
            }else{
                System.out.println("最大值为" + c);
            }
        }else{
            if (b > c){
                System.out.println("最大值为" + b);
            }else{
                System.out.println("最大值为" + c);
            }
        }
    }
}
