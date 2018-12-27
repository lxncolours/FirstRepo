package Day_10.Test06;

import java.util.Arrays;
import java.util.Random;

//定义一个长度为5的数组,元素由随机数给出(0-100), 将该数组与已存在的数组{1,5,9,6}进行合并,
//        将合并后的数组按从小到大的顺序输出!
public class Test06 {
    public static void main(String[] args) {
        int[] ints = new int[5];
        Random random = new Random();
        int[] ints1 = {1, 5, 9, 6};
        for (int i = 0; i < 5; i++) {
            ints[i] = random.nextInt(101);
            System.out.print(ints[i] + " ");
        }
        int[] ints2 = new int[ints.length + ints1.length];
        for (int i = 0; i < ints.length + ints1.length; i++) {
            if (i < ints.length) {
                ints2[i] = ints[i];
            } else {
                ints2[i] = ints1[i - ints.length];
            }
        }
        Arrays.sort(ints2);
        System.out.println(Arrays.toString(ints2));
    }
}
