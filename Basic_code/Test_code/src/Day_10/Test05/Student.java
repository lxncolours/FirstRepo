package Day_10.Test05;

public class Student {
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
    public void studying(Study sy){
        System.out.println(name+"练习中");
        Line line = new Line("JAVASE","JAVAEE");
        sy.info();
        sy.studyLine(line);
    }

}
