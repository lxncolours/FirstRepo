package Day_09.Test06Demo;
//1.定义抽象类Study，要求如下：
//    包含空参、满参构造和以下成员方法
//    定义抽象方法：void stu(Phone p);
//    定义普通方法: void info1()  打印"好好学习,天天向上"
//    定义普通方法: void info2()  打印"键盘敲烂,月薪过万"
//
//
//    2.定义类Phone，要求如下：
//    包含空参、满参构造和以下成员变量
//    品牌 brand
//    价格 price
//    生成所有成员变量set/get方法
//    定义方法：void printPhone(),打印出Phone的具体信息,如"XXX手机,价格YYY"
//    ps: XXX为Phone类的brand属性 yyy为Phone类的price属性
//
//    3.定义类Student，包含空参、满参构造和以下成员变量
//    姓名 name（String 型）
//    年龄 age（int型）
//    生成所有成员变量set/get方法
//    定义成员方法：void studying(Learn le)，要求：
//    1.输出“yyy岁的xxxx学习中”，
//    2.然后在方法内通过传入的Learnd对象le依次调用info1()，info2(),stu(Phone p)方法
//    ps: yyy为Student类中的age方法,xxxx为Student类中的name方法,
//    ps: Learn继承于Study类，需要实现stu(Phone p)抽象方法，实现要求：调用参数p的printPhone()方法;
//
//    4.定义测试类中,创建并初始化一个Student 对象 s, 调用studying(Learn le)方法,打印出如下语句:
//    15岁的关晓彤学习中
//    好好学习,天天向上
//    键盘敲烂,月薪过万
//    华为手机,价格1999
public class Test06 {
    public static void main(String[] args) {
        Student s = new Student("关晓彤",15);
        Learn le = new Learn();
        s.studying(le);
    }
}
