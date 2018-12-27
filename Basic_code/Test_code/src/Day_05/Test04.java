package Day_05;

/*	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
            2.统计该数组中有多少个大于平均值的元素,在控制台上打印出来.并求和.*/
public class Test04 {
    public static void main(String[] args) {
        int[] arry = {123, 43242, 5435, 131, 12312, 534, 77567, 234, 123, 13213};
        sum(arry);
    }

    public static void sum(int[] arry) {
        double pingJunShu;
        double sum1 = 0;
        int sum2 = 0;
        int count = 0;
        for (int i = 0; i < arry.length; i++) {
            sum1 += arry[i];
        }
        pingJunShu = sum1 / arry.length;
        System.out.println("该数组的总和为" + sum1);
        System.out.println("平均数为" + pingJunShu);
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > pingJunShu) {
                count++;
                System.out.println("大于平均数的值有" + arry[i] );
                sum2 += arry[i];
            }
        }
        System.out.println("大于平均数的数有" + count + "个");
        System.out.println("大于平均数的值的总和为" + sum2);
    }
}
