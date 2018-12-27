package Day_05;

/*	1.定义一个包含十个元素的int类型的数组。数组元素自己给出
            2.定义一个方法,求出该数组的平均数,并返回
            3.在main方法中将该数组中大于平均数的元素打印到控制台上(平均数用2中定义的方法得到)*/
public class Test02 {
    public static void main(String[] args) {
        int[] arry = {213, 213, 432, 5, 23, 123, 55, 67, 88, 99, 12};
        double pingjunshu = pingJunShu(arry);
        System.out.println("pingjunshu = " + pingjunshu);
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > pingjunshu) {
                System.out.println(arry[i]);
            }
        }
    }

    public static double pingJunShu(int[] arry) {
        double sum = 0;
        double pingjunshu = 0;
        for (int i = 0; i < arry.length; i++) {
            sum += arry[i];
        }
        pingjunshu = sum / arry.length;
        return pingjunshu;
    }
}
