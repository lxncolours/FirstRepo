package Day_03;

public class WhileXunHuan {
    public static void main(String[] args) {
        int count = 0;
        double num = 0.0001;
        while (num <= 8848){
            count++;
            num = num * 2;
        }
        System.out.println(count);
    }
}
