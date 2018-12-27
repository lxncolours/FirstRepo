package Demo1;
/*强制类型转换
byte short char 参与加法运算的时候自动转换成int类型
byte的最大范围取值是-128--127
char是通过ASC码表翻译成整数参与运算,只有参与运算的时候char才会转换成int类型
不推荐强制转换.容易发生精度损失和数据溢出
*/
public class Dome1 {
    public static void main(String[] args) {
        byte b = 1;
        short i = 169;
        short x = (short)(b + i);
        System.out.println(x);
        byte num1 = 44;
        short num2 = 169;
        short num3 = (short)(num1 + num2);
        System.out.println(num3);
        char num4 = 'D';
        double num5 = 5.22;
        double num6 = num4 + num5;
        System.out.println(num6);
        byte num7 = 22;
        byte num8 = 78;
        byte num9 =(byte) (num7 +num8);
        System.out.println(num9);
        int num10 = num7 + num8;
        System.out.println(num10);
        System.out.println(num10 / num1);//整数除法运算结果只取商
        System.out.println(num10 % num1);//%为取两数相除所得余数
        System.out.println(num1 + "  " +num2 + "  "+ num3);
        System.out.println("==========");

        /*
		++为自增运算符,即为x+1
		--为自减运算符,即为x-1
		++/--在单独存在的时候无论是在变量前或者变量后都可行
		*/
        ++num1;
        System.out.println(num1);
        --num2;
        System.out.println(num2);
        num3++;
        System.out.println(num3);
        num5--;
        System.out.println(num5);
        System.out.println("=========");

        /*
		a*=x 的含义为 a=a*x
		其余赋值运算符类似
		*/
        byte a = 20;
        a *= 3;
        int c = 40;
        c %= 7;
        int d = 200;
        d -= 39;
        int f = 222;
        f += 400;
        int g = 400;
        g /= 2;
        System.out.println(a + " " + c + " " + d + " " + f + " " +g);

        /*
		他们的结果都是boolean类型的(true/false)
		比较运算符不可以连续比较
		*/
        System.out.println("------------");
        int o = 22;
        System.out.println(o == 17);
        System.out.println(o >= 20);
        System.out.println(o <= 10);
        System.out.println(o != 12);
        System.out.println(o < 20);
        System.out.println(o > 10);

    }
}
