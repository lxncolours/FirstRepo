package Day_03;

public class IfElseDemo {
    public static void main(String[] args) {
        int i = 99;
        if (i < 0 || i > 100) {
            System.out.println("数据错误");
        } else if (90 <= i && i <= 100) {
            System.out.println("优秀");
        } else if (80 <= i && i <= 89) {
            System.out.println("好");
        } else if (70 <= i && i <= 79) {
            System.out.println("良好");
        } else if (60 <= i && i <= 69) {
            System.out.println("及格");
        } else {
            System.out.println("不及格");
        }
    }
}
