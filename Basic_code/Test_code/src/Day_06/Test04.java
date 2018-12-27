package Day_06;

/*	定义人类Person,包含以下成员：
            成员属性:
            姓名 name( String类型)
            年龄 age(double类型)

            1.按照以上要求定义Person,属性要私有,生成空参、有参构造，setter和getter方法
            2.定义测试类:根据如下需求创建多个对象(使用满参构造创建,即有参构造).
            老王-35    小芳-23
            3.通过两个对象,比较谁的年龄大,并打印出来.
            例:  老王年龄比较大*/
public class Test04 {
    public static void main(String[] args) {
        Person p = new Person("老王",35.0);
        Person p1 = new Person("小芳",23.0);
        if (p.getAge()>p1.getAge()){
            System.out.println(p.getName()+"年龄比较大");
        } else{
            System.out.println(p1.getName()+"年龄比较大");
        }
    }
}
