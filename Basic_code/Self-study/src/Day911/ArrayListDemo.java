package Day911;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();//创建一个字符串类型的ArrayList集合
        System.out.println(arr);//概览这个集合,集合当中应该为空
        arr.add("赵丽颖");
        arr.add("古力娜扎");
        arr.add("迪丽热巴");//依次添加三个字符串到这个集合当中
        System.out.println(arr);//再次概览集合
    }
}
