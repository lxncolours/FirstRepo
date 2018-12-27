package 刘修南;
/*
1.	定义一个方法union()，传入两个数组，方法的功能是将两个数组的元素合并到一个新数组中, 并返回这个新数组
public static int[] union(int[] arr1, int[] arr2){
        功能: 将两个数组的元素存入到一个新数组中并返回
        }

        2. 在主方法中定义两个数组并赋值,调用union方法传入这两个数组完成数组合并, 将新数组的内容打印到控制台上
        举例:
        数组1中元素:{78, 48, 94, 34}
        数组2中元素:{20, 32, 10, 98, 69, 52}
        合并后数组：{78, 48, 94, 34, 20, 32, 10, 98, 69, 52}
*/

public class Test05 {
    public static void main(String[] args) {
        int[] arr1 = {123, 123123, 423, 5435, 6546, 1231};
        int[] arr2 = {21321, 3123123, 12312, 423423, 121323, 42342};
        int[] arr = union(arr1, arr2);
        System.out.print("新的数组为:[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i] + "]");
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
    }

    public static int[] union(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr[i + arr1.length] = arr2[i];
        }
        return arr;
    }
}
