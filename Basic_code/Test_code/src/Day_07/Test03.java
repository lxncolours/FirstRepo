package Day_07;

import java.util.Random;

/*3.利用循环,随机生成5个整数，范围为60-82，存放到一个int类型的数组中。
        遍历数组，将该数组的和和平均值打印到控制台上。*/
public class Test03 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[5];
        int count = 0;
        while (true) {
            int randomNum = random.nextInt(100);
            if (60 <= randomNum && randomNum <= 82) {
                arr[count] = randomNum;
                count++;
            }
            if (count == 5) {
                break;
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            sum += arr[i];
        }
        double pingjunshu = sum / arr.length * 1.0;
        System.out.println("该数组的总和为" + sum);
        System.out.println("该数组的平均数为" + pingjunshu);
    }
}
