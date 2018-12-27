package Day_08;

public class StringDemo {
    public static void main(String[] args) {
        String str = "你将来一定会感谢现在奋斗的你~";//创建一个String对象
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));//使用charAT方法遍历字符串
        }
    }
}
