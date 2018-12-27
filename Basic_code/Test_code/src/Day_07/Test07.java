package Day_07;

import java.util.Arrays;
import java.util.Random;

//		1.创建两个长度为5的数组，数组内元素为随机生成的 1-100之间的偶数。(r.nextInt(50)+1)*2
//		2.定义一个方法hebin(描述如下)，传入两个数组，方法中将两个数组元素合并到一个新数组中，并且将新数组的内容打印到控制台上
public class Test07 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        for (int i = 0; i < 5; i++) {
            arr1[i] = (r.nextInt(50) + 1) * 2;
            arr2[i] = (r.nextInt(50) + 1) * 2;
        }
        hebin(arr1, arr2);
    }

    public static void hebin(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            result[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            result[i + a.length] = b[i];
        }
        System.out.print("新的数组为:");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + "\t");
        }
    }
}
