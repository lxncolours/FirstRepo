package Day_11;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//使用多态方法创建实现类对象
        listDemo(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void listDemo(List list){
        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");
    }
}
