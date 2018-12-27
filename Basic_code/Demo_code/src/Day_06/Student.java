package Day_06;

public class Student {
    private String name;
    private int age;
    private String gender;
    private int value;

    public Student() {
    }

    public Student(String name, int age, String gender, int value) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.value = value;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public void sendFirstBlood(){
        System.out.println(name +"送出了一血");
    }
}