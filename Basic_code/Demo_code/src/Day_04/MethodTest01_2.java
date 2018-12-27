package Day_04;

public class MethodTest01_2 {
    public static void main(String[] args) {
        isSame(10,20);
    }
    public static void isSame(int a,int b){
        if (a == b){
            System.out.println("这两个数一样");
        } else {
            System.out.println("这两个数不一样");
        }
    }
}
