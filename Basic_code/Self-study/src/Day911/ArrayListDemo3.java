package Day911;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        Person p1 = new Person("张三丰", 80);
        Person p2 = new Person("张翠山", 50);
        Person p3 = new Person("张无忌", 28);//创建三个Person类对象
        ArrayList<Person> person = new ArrayList<>();
        person.add(p1);
        person.add(p2);
        person.add(p3);//把三个Person类对象依次装入ArrayList集合中
        System.out.println(person);//打印出来的集合概览应该是三个地址值
        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i).getName() + "----" + person.get(i).getAge());
        }//遍历ArrayList集合并获取name属性打印
    }
}
