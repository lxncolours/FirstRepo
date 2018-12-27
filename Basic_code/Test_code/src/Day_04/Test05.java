package Day_04;

/*	1.定义一个方法,能够判断传入的int类型数据是不是偶数,返回true或false
            2.借用1中定义的方法,判断1-100中那些数字是偶数,并打印出来,求和.*/
public class Test05 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            if (jiou(i)) {
                System.out.print(i + " ");
                sum += i;
                count++;
            }
            if (count % 5 == 0) {
                System.out.println();
            }
        }
        System.out.println("1-100之间偶数的和为" + sum);
    }

    public static boolean jiou(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
