package Day_09;

public class Person  {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printPerson() {
        System.out.println("我是山顶洞人");
    }

    void palyPhone(Phone p) {
        System.out.println(age + "岁的" + name + "正在玩手机,手机品牌是" + p.getBrand() + ",价格为" + p.getPrice() );
    }
}
