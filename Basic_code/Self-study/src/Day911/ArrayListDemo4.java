package Day911;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//{元素@元素@元素}
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//创建一个ArrayList集合对象
        Random random = new Random();//创建一个Random对象
        Scanner sc = new Scanner(System.in);//创建一个Sacanner对象
        System.out.println("请输入你想要定义的数量");
        int sc1 = sc.nextInt();//获取键盘录入值
        for (int i = 0; i < sc1; i++) {//根据键盘录入数字来设定循环次数
            int randomNum = random.nextInt(100) + 1;
            list.add(randomNum);//通过循环装入1-100的随机数

        }
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                System.out.print("{" + list.get(i) + " @");//当索引为0的时候添加 "{" 和 " @"
            } else if (i == list.size() - 1) {
                System.out.print(list.get(i) + "}");//当索引为长度-1的时候添加 "}"
            } else {
                System.out.print(list.get(i) + " @");//当不满足以上两种情况的时候仅在末尾添加 " @"
            }
        }

    }
}
