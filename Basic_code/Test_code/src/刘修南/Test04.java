package 刘修南;

//定义一个方法printNum, 求1-500(包含1和500)能同时被2，5，7整除的所有数
//        ,并统计满足条件的个数, 在主方法中调用此方法完成测试.
public class Test04 {
    public static void main(String[] args) {
        printNum();
    }

    public static void printNum() {
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 && i % 5 == 0 && i % 7 == 0) {
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println();
        System.out.println("1-500(包含1和500)能同时被2，5，7整除的数有" + count + "个");
    }
}
