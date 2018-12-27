package Day_07;

public class Student {
    String name;
    int age;
    String xueli;

    public Student() {
    }

    public Student(String name, int age, String xueli) {
        this.name = name;
        this.age = age;
        this.xueli = xueli;
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

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }
}
