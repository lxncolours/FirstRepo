package Day_11.Test01;
//按照要求完成以下内容：
//    1. 定义手机类别的抽象类(Phone)，包含空参、满参构造和以下成员变量
//    手机类型brand （String类型）
//    手机价格price (String类型)
//    生成所有成员变量set/get方法
//    抽象方法：  void sell()
//
//    2. 定义IPhone类继承Phone，包含空参、满参构造
//    定义私有方法:void light() 要求输出：“XXX手机刚开始没手电筒”
//    定义私有方法：void drak() 要求输出：“晚上太TM黑了,内衣都走丢了”
//    实现抽象方法：
//    void sell()  输出格式: “名称为XXX的手机售价YYY,真心贵。”
//    定义方法:void effect(),依次调用light(),drak()
//    Ps:XXX为变量brand的值，YYY为price的值
//
//    创建IPhone类手机对象,名称苹果,售价7999,  调用该对象的 sell() 方法和 effect() 方法,打印出如下数据:
//    名称为苹果的手机售价7999,真心贵。
//    苹果手机刚开始没手电筒
//    晚上太TM黑了,内衣都走丢了

public class Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("苹果", "7999");
        iPhone.sell();
        iPhone.effect();
    }
}
