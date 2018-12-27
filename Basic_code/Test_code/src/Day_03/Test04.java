package Day_03;

public class Test04 {
    public static void main(String[] args) {
        int month = 12;  //定义一个变量等于月份
        switch (month){//因为12,1,2月份都输出冬季,所以可以直接去掉break,使其向下穿透
            case 12:
            case 1 :
            case 2 :
                System.out.println(month +"月是冬季");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println(month +"月是春季" );
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println(month + "月是夏季");
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println(month + "月是秋季");
                break;
        }
    }
}


