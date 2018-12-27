package Day_04;

public class MethodTest01 {
    public static void main(String[] args) {
        //第一种调用方法
        isSame(10,20);
        //第二种调用方法
        System.out.println(isSame(10,10));
        //第三种调用方法
        boolean sisame = isSame(10,22);
        System.out.println("sisame = " + sisame);
    }
    public static boolean isSame(int a,int b){
        boolean result = (a == b);
        return result;
    }
}
