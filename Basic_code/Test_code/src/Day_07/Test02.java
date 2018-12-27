package Day_07;
//2.键盘录入任意三个数，按照从小到大的顺序打印出来

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        method1(10);

    }

    public static void method1(int a) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }

        }
        for (int i1 = 0; i1 < arr.length; i1++) {
            System.out.print(arr[i1] + " ");
        }

    }
}
