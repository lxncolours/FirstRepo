package Day_08;

import java.util.ArrayList;

/*	1.创建TPhone类，包含如下属性
    品牌
    价格
    使用年限
    2.在测试类中，利用满参构造创建4个对象，将对象存入集合中。
    华为-1200-4  苹果-9000-1  锤子-3000-3  小米-1800-2
    3.遍历集合，将使用年限小于2或价格低于2000的手机筛选出来。
    4.在控制台上打印所有筛选出来的对象（格式：华为-1200-4）*/
public class Test01 {
    public static void main(String[] args) {
        ArrayList<TPhone> list = new ArrayList<>();
        TPhone huaWei = new TPhone("华为", 1200, 4);
        TPhone apple = new TPhone("苹果", 9000, 1);
        TPhone chuiZi = new TPhone("锤子", 3000, 3);
        TPhone xiaoMi = new TPhone("小米", 1800, 2);
        list.add(huaWei);
        list.add(apple);
        list.add(chuiZi);
        list.add(xiaoMi);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice() < 2000 || list.get(i).getYears() < 2) {
                System.out.println(list.get(i).getBrand() + "-" + list.get(i).getPrice() + "-" + list.get(i).getYears());
            }
        }

    }
}
