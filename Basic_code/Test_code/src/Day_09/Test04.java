package Day_09;
//1.定义一个Phone类.包含如下属性
//    品牌brand
//    价格price
//    生成所有成员变量set/get方法,空参构造和有参构造
//
//    2.定义一个Person类,包含如下属性
//    姓名name
//    年龄age
//    生成所有成员变量set/get方法,空参构造和有参构造
//    定义一个玩手机行为 palyPhone(Phone p) 要求打印:"YYY岁的XXX正在玩手机,手机品牌是ZZZ,价格为QQQ
//
//    PS：YYY是Person类中的 age属性值，XXX是Person 类中的 name属性值，ZZZ是Phone 类中的 brand属性值,QQQ是Phone 类中的 price属性值"
//
//    3.在测试类TestDemo中,创建Person对象ren,调用ren的 palyPhone(Phone p) 方法,打印出
//    "40岁的罗永浩正在玩手机,手机品牌是小米,价格为2999"
//    ps:参数p需要自行创建并初始化变量brand与 price
public class Test04 {
    public static void main(String[] args) {
        Person ren = new Person("罗永浩", 40);
        Phone xiaoMi = new Phone();
        xiaoMi.setBrand("小米");
        xiaoMi.setPrice(2999);
        ren.palyPhone(xiaoMi);
    }
}
