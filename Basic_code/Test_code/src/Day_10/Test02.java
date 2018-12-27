package Day_10;
//定义一个接口Phone,包含:
//    1.抽象方法: playGame()
//    2.默认方法: sendMessage(),输出"发短信"
//    3.静态方法: call(),输出"打电话"
//
//
//    定义IPhone类实现Phone接口,实现抽象方法playGame(),输出"打王者农药,吃鸡"
//    重写默认方法sendMessage(),输出"发彩信"
//
//    在测试类中,编写代码,打印出如下语句(每句话都需调用上述方法打印):
//    打电话
//    打王者农药,吃鸡
//    发彩信
public class Test02 {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        Phone.call();
        iPhone.playGame();
        iPhone.sendMessage();
    }
}
