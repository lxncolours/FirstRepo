package Day_09;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("张无忌");
        str.add("张翠山");
        str.add("殷素素");
        str.add("张三丰");
        str.add("周芷若");
        str.add("谢逊");
        for (int i = 0; i < str.size(); i++) {
            if (str.get(i).startsWith("张")) {
                str.remove(i);
                i--;
            }
        }
        System.out.println("str = " + str);
    }
}
