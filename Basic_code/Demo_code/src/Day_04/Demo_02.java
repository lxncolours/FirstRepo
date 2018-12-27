package Day_04;
//如何实现按数列输出换行
public class Demo_02 {
    public static void main(String[] args) {
        int count = 0;
        int num = 1;
            for (int i = 0; i <= 100; i++) {
                int ge = i % 10;//对各位取余
                int shi = i / 10 % 10;//对十位取余
                if (ge == 3 || shi == 3) {//判断个位和十位是否为3
                    continue;//若为3,则跳过
                }
                System.out.print(i + " ");
                count++;//1
                if (count == num) {
                    System.out.println();
                    count = 0;
                    num++;
                }
            }

    }
}
