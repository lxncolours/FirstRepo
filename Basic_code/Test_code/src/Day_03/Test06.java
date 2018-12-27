package Day_03;
//求出1-100之间，奇数的个数和所有奇数之和。并在控制台上进行打印
public class Test06 {
    public static void main(String[] args) {
        int conut = 0;//设置计数变量
        int sum = 0;//设置求和变量
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0){//对i%2进行取余,如果结果不等于0,那么此时i为奇数
                sum += i;//当i为奇数的时候,对i进行求和
                conut++;//当i为奇数的时候,计数变量自增
            }

        }
        System.out.println("奇数的个数为"+ conut);
        System.out.println("奇数的和为"+ sum);
    }
}
