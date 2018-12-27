package Day_02;

/*
三元运算符的使用
*/
public class Demo01 {
    public static void main(String[] args) {
        //使用三元运算符取两个数的最大值
        int a = 100;
        int b = 200;
        int result = a > b ? a : b;
        System.out.println("结果是" + result);
        //使用三元运算符取三个数的最大值
        int z = 300;
        int temp = a > b ? a : b;
        //其中temp常被用作为中间变量
        int result2 = temp > z ? temp : z;
        System.out.println("三个数的最大值为" + result2);
        System.out.println(123);
        //使用if else 方法求三个数的最大值
        if (a > b) {//首先需要比较a与b之间的大小
            if (a > z) {//如果a > b,那么此时还需要比较a与c之间的大小
                System.out.println("最大值为" + a);
            } else {//如果a < z ,那么此时的最大值为z
                System.out.println("最大值为" + z);
            }
        } else {//如果a < b,那么此时还需要比较b与z之间的大小
            if (b > z) {//如果b > z ,那么此时最大值为b
                System.out.println("最大值为" + b);
            } else {//如果b < z ,那么此时的最大值为z
                System.out.println("最大值为" + z);
            }

        }
    }
}
