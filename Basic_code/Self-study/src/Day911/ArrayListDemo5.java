package Day911;
//筛选集合中的随机数

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//定义一个只能装整数的集合
        Random random = new Random();//创建一个Random对象
        Scanner sc = new Scanner(System.in);//创建一个Scanner对象
        int sc1 = sc.nextInt();//调用nextInt()方法获取键盘录入
        for (int i = 0; i < sc1; i++) {
            int randomNum = random.nextInt(100) + 1;
            list.add(randomNum);
        }//根据键盘录入数字来装入录入数字个数的随机数
        System.out.println(list);//概览集合
        System.out.println("--------------------");
/*        for (int i = 0; i < list.size(); i++) {
            for (int i1 = 0; i1 < list.size() - 1; i1++) {
                if (list.get(i) %2 == 0){
                    list.remove(i);
                    i--;
                }
            }
        }*/


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {//通过循环把偶数剔除
                list.remove(i);
                i--;//如果某个元素被筛除,那么后面的元素值索引-1
            }
        }
        System.out.println(list);
    }
}
