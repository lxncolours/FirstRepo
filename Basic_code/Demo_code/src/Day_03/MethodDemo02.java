package Day_03;

/*
定义方法的格式:
修饰符  返回值类型  方法名(参数类型 参数名称,...){
            方法体;
            renturn 返回值;
        }
        返回值的数据类型要和定义方法时的数据类型对应
定义方法三要素:
    返回值类型:
    方法名称:
    参数列表:

调用方法的三种格式:
    单独调用: 方法名称(参数);
    打印调用:System.out.println(方法名称(参数));
    赋值调用:数据类型  变量名称 = 方法名称(参数);

 */
public class MethodDemo02 {
    public static void main(String[] args) {
        int d = sum(888888, 988979898);
        System.out.println("sum等于" + sum(99, 87));
        int result = sum(9999, 7788);
        System.out.println(result);
    }

    public static int sum(int a, int b) {//此处返回值类型为int,方法名为sum,参数列表为int a,int b
        int result = a + b;
        return result;
    }

}
