package Day_05;

import java.util.Arrays;

//漂亮的打印数组
//使输出格式为 arry = [a, b, c, d, e]
public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arry = {12312, 231231, 123, 13, 123, 123, 12333};//定义一个数组
        System.out.print("arry = [");//先打印输出结果的前半部分,用字符串表示
        for (int i = 0; i < arry.length; i++) {
            if (i == arry.length - 1) {//判断此时是否为数组的最后一位
                System.out.println(arry[i] + "]");//如果是,那么打印结尾的"]"
            } else {
                System.out.print(arry[i] + ", ");//如果不是,那么打印 值 + ", "
            }
        }
        System.out.println(Arrays.toString(arry));
    }
}
