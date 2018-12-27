package Day_08;

import java.util.ArrayList;
import java.util.Scanner;

//	1.创建一个集合,往集合中键盘录入5个字符串
//  2.遍历集合,将集合中长度大于4的元素末尾加上一个X,
//  3.遍历集合,将集合打印在控制台上.
//      例:键盘录入后的集合{"123","ASDFQ","qq","poiuy","asd"}
//      打印到控制台上的集合{"123","ASDFQX","qq","poiuyX","asd"}
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            String str1 = sc.nextLine();
            str.add(str1);
        }
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).length() >4){
                str.set(i,str.get(i)+"x");
            }
        }
        for (int i = 0; i < str.size(); i++) {
            System.out.println(str.get(i));
        }
    }
}
