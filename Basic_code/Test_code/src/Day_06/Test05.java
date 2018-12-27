package Day_06;
/*1.定义“电脑类”Computer，包含以下成员：
        成员属性:
        品牌brand( String类型)
        价格 price(double类型)
        成员方法:
        编码coding(),  调用方法打印 ***电脑正在使用Java语言编程
        玩游戏,playGame()，调用方法打印 ***电脑正在玩王者荣耀s

        1.按照以上要求定义Computer,属性要私有,生成空参、有参构造，setter和getter方法
        2.定义测试类,a.创建一个电脑对象，设置品牌为ThinkPad，价格为7399，调用方法coding
        b.创建一个电脑对象，设置品牌为Acer，价格为5399,调用方法playGame*/
public class Test05 {
    public static void main(String[] args) {
        Computer c1 = new Computer("ThinkPad",7399);
        Computer c2 = new Computer("Acer",5399);
        c1.coding();
        c2.playGame();
    }
}

