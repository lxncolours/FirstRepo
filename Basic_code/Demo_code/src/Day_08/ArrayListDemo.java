package Day_08;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {
    public static void main(String[] args) {
        Random r = new Random();//创建一个Random对象
        ArrayList<Integer> list = new ArrayList<>();//创建一个ArrayList对象
        while (true) {
            int num = r.nextInt(10) + 1;
            if (num >= 5) {
                list.add(num);
            }
            if (list.size() - 1 == 10) {
                break;
            }
        }
        //漂亮的打印数组
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (list.size() - 1 == i) {
                System.out.println(list.get(i) + "]");
            } else {
                System.out.print(list.get(i) + ", ");
            }
        }
    }
}
