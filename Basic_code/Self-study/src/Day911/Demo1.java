package Day911;

public class Demo1 {
    public static void main(String[] args) {
        Person[] arr = new Person[3];
        Person one = new Person("迪丽热巴", 18);
        Person two = new Person("古力娜扎", 28);
        Person three = new Person("马尔扎哈", 38);//创建三个Person类对象

        arr[0] = one;
        arr[1] = two;
        arr[2] = three;//把三个Person类对象分别装入数组当中

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);//打印三个元素,结果应该为三个地址值

        System.out.println(arr[0].getName());//打印0号索引当中的name属性
    }
}
