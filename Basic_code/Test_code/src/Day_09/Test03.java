package Day_09;
//1.定义Person类,包含空参、满参构造和以下成员变量:
//    姓名name
//    年龄age
//    生成所有成员变量set/get方法
//    定义方法：void printPerson(),打印出"我是山顶洞人"
//
//    2.定义Student继承于Person类,新增如下属性
//    学校 school
//    生成空参、满参构造和set/get方法
//    定义方法:void printStudent(),先输出"我叫XXX,我今年YYY岁,我现在的学校是:ZZZ" 再调用printPerson()方法
//
//    3.在测试类中,创建并初始化一个Student 对象 s, 调用printStudent()方法,打印出如下语句:
//    我叫卡特琳娜,我今年19岁,我现在的学校是:战争学院
//    我是山顶洞人
public class Test03 {
    public static void main(String[] args) {
        Student s = new Student("卡特琳娜",19,"战争学院");
        s.printStudent();
    }
}
