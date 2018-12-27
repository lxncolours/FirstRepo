package Day_09;

public class Student extends Person {
    private String school;

    public Student() {
    }

    public Student(String school) {
        this.school = school;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    void printStudent() {
        System.out.println("我叫" + getName() + ",我今年" + getAge() + "岁,我现在的学校是:" + school);
        printPerson();
    }

}
