package Demo1;

/*
 *   &&(与) 两边同时为true才为true        有false则false
 *   ||(或) 只要有一边结果为true则true     有true则true
 *   !(非)  显示与结果相反的布尔值
 *   && ||  具有短路效果,当左边的代码已经可以得出结果的时候,右边的代码将不会运算
 * */
public class Day_03 {
    public static void main(String[] args) {
        boolean b = 10 < 2;
        int a = 22;
        int c = 190;
        int d = a + c;
        System.out.println(a > c && true);
        System.out.println(b || true);
        System.out.println(!(d > a));

        //模拟服务器端的数据
        int username_copy = 12333123;
        int password_copy = 99887721;
        int yzm_copy = 177865;

        //模拟用户输入的数据
        int username = 12333123;
        int password = 99887721;
        int yzm = 177889;

        //模拟登陆的比较过程
        boolean b1 = username == username_copy;
        boolean b2 = password == password_copy;
        boolean b3 = yzm == yzm_copy;
        boolean re = b1 && b2 && b3;
        if (re = true) {
            System.out.println("恭喜你登陆成功");
        } else {
            System.out.println("密码有误");
        }

        //三元运算符格式 数据类型 变量名称 = 条件判断 ? 表达式A : 表达式B
        int a1 = 299;
        int a2 = 2222;
        int a3 = a1 > a2 ? a1 : a2;
        System.out.println(a3);

       /* if 首先判断小括号内的条件是否成立
        如果小括号内结果为ture,则执行大括号内的程序
        如果小括号的结果为false,则跳过大括号的内容*/

        int num1 = 10;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("最大值为:" + num1);
        }

        if (num1 < num2) {
            System.out.println("最大值为:" + num2);
        }
        //if--else 标准用法
         if(num2 % 2 == 0){
             System.out.println("偶数");
         }else{
             System.out.println("奇数");
         }
    }
}

