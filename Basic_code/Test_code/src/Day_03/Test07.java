package Day_03;
//	求出三位数中所有的水仙花数,并将他们打印到控制台上.求出所有水仙花数的和,并统计共有多少个水仙花数.
public class Test07 {
    public static void main(String[] args) {
        int count = 0;//设置计数变量
        int sum = 0;//设置求和变量
        for (int i = 100;100 <= i && i <= 1000;i++){
            int ge = i%10;
            int shi = i/10%10;
            int bai = i/10/10%10;
            if ((ge*ge*ge) +(shi*shi*shi)+(bai*bai*bai) == i ){//如果条件满足,那么此时i就为水仙花数
                sum += i;//求所有满足条件的水仙花数之和
                count++;//计数器自增
            }
        }
        System.out.println("水仙花数的个数为:"+count);
        System.out.println("水仙花数的和为:"+ sum);
    }
}
