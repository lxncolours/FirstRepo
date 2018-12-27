package Day_03;

public class Test02 {
    public static void main(String[] args) {
        int i = 10;
        if (0 <= i && i <= 59){
            System.out.println("不及格");
        } else if(60 <= i && i <= 70){
            System.out.println("良");
        } else if(71 <= i && i <= 85){
            System.out.println("中");
        } else if(86 <= i && i <= 100){
            System.out.println("优");
        } else {
            System.out.println("请写合法的成绩");
        }
    }
}
