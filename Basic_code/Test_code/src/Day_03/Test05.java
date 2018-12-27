package Day_03;
//1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
//	2.请问，折叠多少次，可以折成珠穆朗玛峰的高度。
public class Test05 {
    public static void main(String[] args) {
        double paper = 0.0001;
        int zhu = 8848;
        int count = 0; //设置计数变量
        while (paper <= zhu){//判断纸目前的厚度是否达到珠穆朗玛峰的高度
            paper *= 2;//如果未达到,则值得厚度乘以2
            count++;//次数加1
        }
        System.out.println("达到珠穆朗玛峰需要折叠"+ count +"次");
    }
}
