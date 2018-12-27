package Day_05;
//数组元素的反转
public class ArrayDemo04 {
    public static void main(String[] args) {
        int [] arry = {123,324,234,54,654,322};
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }//首先遍历数组,打印原来数组当中的元素
        System.out.println("==================");

//        初始化语句:int min = 0,max = arry.length - 1;
//        条件判断语句:min < max;
//        控制条件语句: min++,max--;
//        想要完成数组中的元素反转,那么首先要定义三个变量
//                首先把变量1的值赋值给变量3
//                然后把变量2的值赋值给变量1
//                最后把变量3的值也就是最初变量1的值赋值给变量3,这样就完成了数组中的元素反转
        for (int min = 0,max = arry.length - 1; min < max; min++,max--) {
            int temp = arry[min];
            arry[min] = arry[max];
            arry[max] = temp;
        }
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i]+" ");
        }
        }
    }

