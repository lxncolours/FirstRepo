package Day_08;

import java.util.Scanner;

//	1.键盘录入一个字符串
//  2.统计录入的字符串中的大写字母,小写字母,数字分别有多少个.
public class Test04 {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        int daXie = 0;
        int xiaoXie = 0;
        int shuZi = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 48 && chars[i] <= 57) {
                shuZi++;
            } else if (chars[i] >= 65 && chars[i] <= 90) {
                daXie++;

            }else if (chars[i]>=97&&chars[i]<=122){
                xiaoXie++;
            }else {
                continue;
            }
        }
        System.out.println("字符串中的数字个数为" + shuZi);
        System.out.println("字符串中的小写字母个数为" + xiaoXie);
        System.out.println("字符串中的大写字母个数为" + daXie);
    }
}
