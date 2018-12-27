package 刘修南;

/*第一题:
        在main方法中定义3个变量：int a = 50;  int b = 30;  int c = 80;
        并依次完成以下要求：
        1.定义方法getMax()利用if语句求出a、b、c中最大的数并打印到控制台上；
        2.定义方法getMin()利用三元运算符求出a、b、c中最小的数并打印到控制台上；*/

public class Test01 {
    public static void main(String[] args) {
        int a = 50;
        int b = 30;
        int c = 80;
        getMax( a, b, c);
        getMin( a, b, c);
    }
    public static void getMax(int a,int b,int c){
        if (a > b){
            if(a > c){
                System.out.println("最大数为" + a);
            }else {
                System.out.println("最大数为" + c);
            }
        }else{
            if (b > c){
                System.out.println("最大数为" + b);
            }else {
                System.out.println("最大数为" + c);
            }
        }
    }
    public static void getMin(int a,int b,int c){
        int min;
        min = a > b ? b : a;
        min = min > c ? c : min;
        System.out.println("最小值为" + min);
    }
}
