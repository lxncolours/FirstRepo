package Day_09;

//1.定义一个Phone类,包含如下方法:
//    call() 输出:"打电话"
//    sendMessage() 输出:"发短信"
//    playGame();输出:"玩游戏"
//
//
//    2.定义一个IPhone类,继承Phone类
//    重写sendMessage()方法,输出:"发彩信"
//    重写playGame()方法,输出:"打王者农药"
//    定义自己特有的行为 :
//    siri() 打印"人工智障"
//
//    3.定义测试类IPhoneTest, 创建IPhone的对象,调用方法,打印出如下语句
//    打电话
//    发彩信
//    打王者农药
//    人工智障
public class Test02 {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone();
        iPhone.call();
        iPhone.sendMessage();
        iPhone.playGame();
        iPhone.siri();
    }
}
