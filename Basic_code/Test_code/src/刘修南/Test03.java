package 刘修南;
/*
定义五个方法分别求数组的最大值 ,最小值, 总和, 平均值与奇数的个数,
        在主方法中定义数组{23,55,32,18,67,75,97,12,78,89}, 调用每个方法完成测试
*/

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {23, 55, 32, 18, 67, 75, 97, 12, 78, 89};
        getMax(arr);
        getMin(arr);
        getSum(arr);
        getPingJun(arr);
        getJiShu(arr);

    }

    public static void getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组中的最大值为" + max);
    }

    public static void getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("数组中最小值为" + min);
    }

    public static void getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("数组中总和为" + sum);
    }

    public static void getPingJun(int[] arr) {
        double pingjun = 0;
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        pingjun = sum / arr.length;
        System.out.println("该数组的平均数为" + pingjun);
    }

    public static void getJiShu(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }
        System.out.println("该数组中奇数的个数为" + count + "个");
    }
}

