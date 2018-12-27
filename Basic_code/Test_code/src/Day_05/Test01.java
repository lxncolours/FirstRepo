package Day_05;

/*	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
            2.遍历打印出数组元素
            3.求出数组当中的最小值打印出来
            4.求出数组当中的最大值打印出来*/
public class Test01 {
    public static void main(String[] args) {
        int[] arry = {12, 3, 4, 5, 6, 4, 3, 2, 1, 2, 3};
        int max = arry[0];
        int min = arry[0];
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + "\t");
            if (arry[i] > max) {
                max = arry[i];
            }
            if (arry[i] < min) {
                min = arry[i];
            }
        }
        System.out.println();
        System.out.println("数组中的最小值为" + min);
        System.out.println("数组中的最大值为" + max);
    }
}
