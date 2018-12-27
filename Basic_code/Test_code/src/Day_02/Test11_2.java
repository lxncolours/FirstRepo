package Day_02;
/*
	1.功能描述:定义一个变量代表月份，输出对应的季节
            2.要求:
            (1)定义一个整数(代表月份,范围1-12)
            (2)输出该月份对应的季节
            3,4,5春季
            6,7,8夏季
            9,10,11秋季
            12,1,2冬季
            (3)演示格式如下:
            月份:3
            控制台输出:3月份是春季
*/

public class Test11_2 {
    public static void main(String[] args) {
        int i =2;
        if (1 <= i && i <= 2) {
            System.out.println(i +"月是冬季");
        } else if (3 <= i && i<= 5) {
            System.out.println(i + "月是春季");
        } else if (6 <= i && i <= 8){
            System.out.println(i + "月是夏季");
        } else if (9 <= i && i <= 11){
            System.out.println(i + "月是秋季");
        } else if (i == 12){
            System.out.println(i + "月是冬季");
        } else {
            System.out.println("数据错误");
        }
    }
}
