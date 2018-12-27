package Day911;

import java.util.ArrayList;
import java.util.Random;

//在集合中添加随机数
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();//创建ArrayList集合对象
        Random random = new Random();//创建一个Random对象
        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt(100);
            list.add(randomNum);//通过循环把随机数装入ArrayList集合当中
            System.out.println(list);//概览ArrayList集合
        }
        list.remove(4);//从集合中删除元素
        System.out.println("list = " + list);//打印删除元素后的集合概览
        System.out.println("这个集合现在的长度是" + list.size());//打印删除元素后的集合长度
    }
}
