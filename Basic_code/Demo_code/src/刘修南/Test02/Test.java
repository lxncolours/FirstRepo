package 刘修南.Test02;
//按照要求完成以下内容：
//    3. 测试类Test，提供main方法
//
//    创建类型为“竞技”，名称为“王者荣耀”的手游类(MobileGame)对象 ，   实现要求：依次调用play方法和prepare方法。;
public class Test {
    public static void main(String[] args) {
        MobileGame mobileGame = new MobileGame("竞技", "王者荣耀");
        mobileGame.paly();
        mobileGame.prepare();
    }
}
