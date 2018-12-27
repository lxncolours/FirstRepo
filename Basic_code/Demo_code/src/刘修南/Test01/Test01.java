package 刘修南.Test01;

import java.util.Arrays;
import java.util.Scanner;

//有一个已经排好序的数组[1, 8, 26, 45, 60, 78, 99]，现在键盘录入一个0-100之间（范围无需代码判断）的数字，
//将该数字按从小到大顺序插入到该数组（如输入数字50,
//那么这个数组的结果为：[1, 8, 26, 45, 50, 60, 78, 99]）。
//并在控制台中打印插入前和插入后的数组。
public class Test01 {
    public static void main(String[] args) {
        int[] s1 = {1, 8, 26, 45, 60, 78, 99};
        System.out.println("修改前的数组:");
        System.out.println(Arrays.toString(s1));
        Scanner sc = new Scanner(System.in);
        int[] s2 = new int[s1.length + 1];
        for (int i1 = 0; i1 < s1.length; i1++) {
            s2[i1] = s1[i1];
        }
        int i = sc.nextInt();
        s2[(s2.length - 1)] = i;
        Arrays.sort(s2);
        System.out.println("修改后的数组:");
        System.out.println(Arrays.toString(s2));
    }
}
