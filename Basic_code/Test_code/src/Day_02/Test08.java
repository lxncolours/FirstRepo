package Day_02;

public class Test08 {
    public static void main(String[] args) {
        int num = 679;
        int a = num % 10;//a为个位数
        int b = num / 10 % 10;//b为十位数
        int c = num / 10 / 10 % 10;//c为百位数
        System.out.println("数字"+ num +"的个位是"+ a +",十位是"+ b + ",百位是" + c);
    }
}
