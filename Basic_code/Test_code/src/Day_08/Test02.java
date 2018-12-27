package Day_08;
/*
	1.创建事务描述类Person,包含空参构造、满参构造和以下成员变量:
    学号 id    int类型
    姓名 name  String类型
    年龄 age   int类型
    生成以上成员的get/set方法

    2.根据以下信息创建三个对象,并将他们装入集合
    1-马尔扎哈-45  2-塔利斯塔-36  3-迪丽热巴-25

    3.遍历集合,将其中岁数小于30的对象删除,将余下的对象按照如下格式打印出来
    1-马尔扎哈-45
*/

import java.util.ArrayList;

public class Test02 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person(1, "马尔扎哈", 45);
        Person p2 = new Person(2, "塔利斯塔", 36);
        Person p3 = new Person(3, "迪丽热巴", 25);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).age < 30) {
                list.remove(i);
                i--;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).id + "-" + list.get(i).name + "-" + list.get(i).age);
        }
    }
}
