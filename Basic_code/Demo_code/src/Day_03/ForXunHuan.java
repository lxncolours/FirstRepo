package Day_03;
//求水仙花数
//水仙花数是一个三位数 ,他的个十百位的立方等于这个数
public class ForXunHuan {
    public static void main(String[] args) {
        //如果要统计循环次数需要设置一个统计变量
        int count = 0;                      //之所以设置在for循环外是因为如果在循环内设置,每次循环count将会被归零
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;                //求一个数的个位
            int bai = i / 10 % 10;          //求一个数的百位
            int qian = i / 10 / 10 % 10;    //求一个数的千位
            //判断个十百为的立方相加是否等于数本身,如果成立则输出
            if ((ge * ge * ge) + (bai * bai * bai) + (qian * qian * qian) == i) {
                System.out.println("水仙花数是:" + i);
                count++;                   //如果成立一次,那么变量count做一次自增
            }
        }
        System.out.println("水仙花数的个数是" + count);//我们只需要得到水仙花数的总数,所以在循环外输出count最终的结果即可
    }
}
