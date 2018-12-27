package Day_07;
/*

        1.创建Student类，包含如下属性
        姓名
        年龄
        学历
        2.在测试类中，利用满参构造创建3个对象。
        小红  12 小学          小米    21  大学        小明     14    初中
        3.将这些对象属性在控制台上输出：如  小红-12-小学
*/

public class Test04 {
    public static void main(String[] args) {
        Student s1 = new Student("小红", 12, "小学");
        Student s2 = new Student("小米", 21, "大学");
        Student s3 = new Student("小明", 14, "初中");
        System.out.println(s1.name + "-" + s1.age + "-" + s1.xueli);
        System.out.println(s2.name + "-" + s2.age + "-" + s2.xueli);
        System.out.println(s3.name + "-" + s3.age + "-" + s3.xueli);
    }
}
