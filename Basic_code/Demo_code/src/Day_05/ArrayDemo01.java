package Day_05;

public class ArrayDemo01 {
    public static void main(String[] args) {
        int[] arr = new int[5];//定义一个数组,长度为5
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);//遍历数组,打印该数组的默认值
        }
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;
        arr[4] = 500;
        //            //给数组中的元素重新赋值
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.println(arr[i1]);//重新遍历数组,打印更改更改后的数组元素值
        }

    }
}
