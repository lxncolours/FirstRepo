package Day_06;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s);
        s.setName("快乐风男");
        s.setAge(30);
        s.setGender("男");
        s.setValue(300);
        System.out.println(s.getName());
        System.out.println(s.getAge());
        System.out.println(s.getGender());
        System.out.println(s.getValue());
        s.sendFirstBlood();
        System.out.println("--------------");
        Student s1 = new Student("会走路的三百块",20,"男",300);
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getGender());
        System.out.println(s1.getValue());
        s1.sendFirstBlood();
    }
}
