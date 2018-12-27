package Day_08;
//	定义一个字符串s = "Hello-World",利用API完成如下小需求
//    1.判断字符串s,与字符串"World"是否相等,并打印出来.
//    2.用程序得到字符串"Wo",在字符串s中的起始索引.
//    3.得到s中,3号索引对应的字符,打印到控制台上
//    4.得到s的长度,打印在控制台上.
//    5.获得s中的"Hell"字符串,打印在控制台上.
//    6.获得s中的"orld"字符串,打印在控制台上.
//    7.将字符串s中的所有o替换为*号.打印在控制台上
//    8.将字符串s切割成"Hello"和"World"两个字符串,打印在控制台上
//    9.将字符串s变为字符数组,遍历数组将每个字符打印在控制台上

public class Test03 {
    public static void main(String[] args) {
        String s = "Hello-World";
        boolean b1 = s.equals("World");
        System.out.println("b1 = " + b1);//1.判断字符串s,与字符串"World"是否相等,并打印出来.
        int num = s.indexOf("Wo");// 2.用程序得到字符串"Wo",在字符串s中的起始索引.
        System.out.println(num + "---");
        char c = s.charAt(3);
        System.out.println("s中3号索引对应的字符为" + c);//3.得到s中,3号索引对应的字符,打印到控制台上
        System.out.println(s.length());//4.得到s的长度,打印在控制台上.
        //    5.获得s中的"Hell"字符串,打印在控制台上.
        String str = "Hell";
        int num1 = s.indexOf(str);
        String s2 = s.substring(num1, num1 + str.length());
        System.out.println(s2);
        //    6.获得s中的"orld"字符串,打印在控制台上.
        String str1 = "orld";
        int num2 = s.indexOf(str1);
        String s3 = s.substring(num2, num2 + str1.length());
        System.out.println(s3);
        //    7.将字符串s中的所有o替换为*号.打印在控制台上
        String s1 = s.replace('o', '*');
        System.out.println("s1 = " + s1);
        //    8.将字符串s切割成"Hello"和"World"两个字符串,打印在控制台上
        String[] split = s.split("-");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        //    9.将字符串s变为字符数组,遍历数组将每个字符打印在控制台上
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

    }
}
