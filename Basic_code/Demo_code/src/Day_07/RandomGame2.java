package Day_07;

import java.util.Random;
import java.util.Scanner;

public class RandomGame2 {
    public static void main(String[] args) {
        Random r = new Random();
        int randomNum = r.nextInt(100) + 1;//先生成一个随机数
        Scanner sc = new Scanner(System.in);//创建有一个Scanner对象
        for (int i = 1; i <= 10; i++) {
            System.out.println("请输入你猜测的数字");
            int gussNum = sc.nextInt();
            if (gussNum > randomNum){
                System.out.println("太大了,请重试");
                System.out.println("你还剩下"+(10-i)+"次机会");
            }else if(gussNum < randomNum){
                System.out.println("太小了,请重试");
                System.out.println("你还剩下"+(10-i)+"次机会");
            }else{
                System.out.println("恭喜你,答对了");
                break;
            }
        }
    }
}
