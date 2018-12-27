package Day_09.Test06Demo;

public class Student  {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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
    void studying(Learn le){
        System.out.println(age+"岁的"+name+"学习中");
        le.info1();
        le.info2();
        Phone p = new Phone("华为", 1999);
        le.stu(p);
    }
}
