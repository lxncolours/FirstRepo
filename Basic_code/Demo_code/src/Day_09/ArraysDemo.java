package Day_09;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        String str = "asde13eds21e131e1deSADJAS";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
