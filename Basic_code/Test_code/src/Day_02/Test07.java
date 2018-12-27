package Day_02;

public class Test07 {
        public static void main(String[] args) {
            short s = 30;
            int i = 50;
            s += i;
            System.out.println("s="+s);//"s= 80"
            int x = 0;
            int y = 0;
            int z = 0;
            boolean b;

            b = x>0 && z++>1;//b = false z = 0 因为左边已经为false,所以发生短路现象,右边代码不执行
            x++;//x = 1
            System.out.println("b="+b);//"b= false"
            System.out.println("z="+z);//"z= 0"

            b = x>0 || z++>1;//b = true  z = 0 因为左边已经为true,所以发生短路现象,右边代码不执行
            System.out.println("b="+b);//"b= true"
            System.out.println("z="+z);//"z= 0"
        }
    }

