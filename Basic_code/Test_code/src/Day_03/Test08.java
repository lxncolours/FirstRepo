package Day_03;

//1.打印1到100之内的整数，但数字中包含3的要跳过
//	2.每行输出5个满足条件的数，之间用空格分隔
//	3.如：1 2 4 5 6
//		  7 8 9 10 11
//		  ...
public class Test08 {
    public static void main(String[] args) {
        int count = 0;//设置计数变量
        for (int i = 1; i <= 100; i++) {//先判断个十百位是否为3
                int ge = i % 10;//对各位取余
                int shi = i / 10 % 10;//对十位取余
                if (ge == 3 || shi == 3) {//判断个位和十位是否为3
                    continue;//若为3,则跳过
            }
            System.out.print(i + " ");//打印所以个位十位不等3的整数
            count++;//计数器自增
            if (count % 5 == 0) {//打印5个数需要换行,所以判断打印是否达到5次
                System.out.println();//达到5次那么实现换行
            }
        }
    }
}
