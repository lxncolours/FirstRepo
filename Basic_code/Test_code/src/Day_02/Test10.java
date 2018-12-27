package Day_02;
//	1.定义两个int类型变量a,b. 求出两个变量的最大值,并打印出来
public class Test10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; //设置变量
        if(a > b){  //比较a 和 b
            System.out.println(a);//如果a大,那么最大值为a,输出a
        }else{
            System.out.println(b);//如果b大,那么最大值为b,输出b
        }
//        2.定义三个int类型变量c,d,e. 求出三个变量的最大值,并打印出来
        int c = 13;
        int d = 15;
        int e = 17;
        if(c > d ){//先比较c和d
            if(c > e){//如果c大于d,那么继续用c和e进行比较
                System.out.println(c);//如果c大于e,那么最大值为c,输出c
            }else{
                System.out.println(e);//如果c小于e,那么最大值为e,输出e
            }
        }else{//如果c小于d
            if(d > e){//那么再拿d和e来比较
                System.out.println(d);//如果d大于e,那么最大值为d,输出d
            }else{//如果d小于e,那么最大值为e
                System.out.println(e);//输出e
            }
        }
    }
}
