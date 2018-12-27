package Demo2;

public class Demo {
    public static void main(String[] args) {
//        switch的简单使用
        /*
        标准格式:
            switch(){
                case 常量1:
                    语句体;
                    break;
                case 常量2:
                    语句体2;
                    break;
                ...
                default:
                    语句体n+1;
                    break;
            }

            注意事项:
            1.case后的常量不可相同
            2.switch后小括号内的数据类型只能是:
            基本数据类型:byte,short,int,char
            引用数据类型:String字符串,enum枚举
         */
        int num = 10;
        switch (num) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("数据错误");
                break;
        }
    }
}
