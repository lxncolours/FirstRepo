package Day_03;

/*纸得的厚度为0.0001米,珠穆朗玛峰的高度为8848米,问纸需要折叠多少次才能达到珠穆朗玛峰的高度
    初始化值: double num = 0.0001;
    关系表达式: num <= 8848;
    控制条件语句: num = num * 2;
    循环体语句: count++;     求次数,所以每成功循环一次,循环次数变量count+1
 */
public class ForTest {
    public static void main(String[] args) {
        int count = 0;
        for (double num = 0.0001; num <= 8848; num = num * 2) {
            count++;
        }
        System.out.println("这张纸需要折叠的次数为" + count + "次!");
    }
}
