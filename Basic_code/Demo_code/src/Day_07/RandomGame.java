package Day_07;

import java.util.Random;
import java.util.Scanner;

public class RandomGame {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//先生成一个随机数
        Scanner sc = new Scanner(System.in);//创建有一个Scanner对象
        while (true) {
            System.out.println("请输入一个1-100之间的整数");
            int gussNum = sc.nextInt();//获取键盘输入的数字
            if (gussNum > randomNum) {
                System.out.println("太大了,请重试");
            } else if (gussNum < randomNum) {
                System.out.println("太小了,请重试");
            } else {
                System.out.println("恭喜你,猜中了");
                break;
            }
        }
        System.out.println("游戏结束");
    }
}
