package Day_05;

public class ArrayDemo02 {
    public static void main(String[] args) {
        int[] arry = {123, 132, 312321, 43, 23};//定义一个数组
        int max = arry[0];//定义一个最大值参照
        int min = arry[0];//定义一个最小值参照
        for (int i = 1; i < arry.length; i++) {
            if (arry[i] > max) {
                max = arry[i];//如果数组中有比参照值更大的值,那么把该值赋值给max
            }
            if (arry[i] < min) {
                min = arry[i];//如果数组中有比参照值更小的值,那么把该值赋值给min
            }
        }
        System.out.println("数组的最大值为" + max);
        System.out.println("数组的最小值为" + min);
    }
    }
    

