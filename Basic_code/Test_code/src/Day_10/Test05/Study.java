package Day_10.Test05;

public interface Study {
    void studyLine(Line line);
    default void info(){
        stu1();
        stu2();
    }
    private void stu1(){
        System.out.println("好好练习，天天向上");
    }
    private void stu2(){
        System.out.println("镜头拍烂，月薪百万");
    }

}
