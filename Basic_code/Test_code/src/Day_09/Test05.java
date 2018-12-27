package Day_09;

import java.util.ArrayList;

//1.定义“手机类”Phone包含空参构造、满参构造和以下成员变量：
//        名称name（String类型）
//        价格price（double类型）
//        类型type（String类型）
//        生成以上成员变量的set/get方法
//
//        2.定义测试类PhoneTest，完成以下要求：
//        ①定义public static ArrayList<Phone> filter(ArrayList<Phone> list,double price) {...}方法:
//    要求：遍历list集合，将list中价格大于参数price的元素存入到另一个ArrayList<Phone> 中并返回
//    ②在main方法内完成以下要求:
//    a.根据以下内容创建并初始化3个Phone对象
//    {"小米MIX2",2999,"新机皇"}
//    {"Iphone8", 5888,"火爆新机"}
//    {"VIVO X9s",1998,"火爆新机"}
//    b.创建一个ArrayList<Phone> list_phone，将上面的3个Phone对象添加到list_phone中，
//    调用filter方法传入list_phone和2000，根据返回的list集合输出元素信息
//    示例如下：
//    小米MIX2-2999-新机皇
//    Iphone8-5888-火爆新机
public class Test05 {
    public static void main(String[] args) {
        Phone xiaoMi = new Phone("小米MIX2", 2999, "新机皇");
        Phone apple = new Phone("Iphone8", 5888, "火爆新机");
        Phone vivo = new Phone("VIVO X9s", 1998, "火爆新机");
        ArrayList<Phone> list_phone = new ArrayList<>();
        list_phone.add(xiaoMi);
        list_phone.add(apple);
        list_phone.add(vivo);
        ArrayList<Phone> p = filter(list_phone, 2000);
        for (int i = 0; i < p.size(); i++) {
            String brand = p.get(i).getBrand();
            double price = p.get(i).getPrice();
            String type = p.get(i).getType();
            System.out.println(brand + "-" + price + "-" + type);
        }
    }

    public static ArrayList<Phone> filter(ArrayList<Phone> list, double price) {
        ArrayList<Phone> phones = new ArrayList<Phone>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() > price) {
                phones.add(list.get(i));
            }
        }
        return phones;
    }
}
