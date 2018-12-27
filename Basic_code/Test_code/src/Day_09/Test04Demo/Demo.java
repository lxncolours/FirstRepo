package Day_09.Test04Demo;
//	1.定义抽象类Phone，要求如下：
//        包含空参、满参构造和以下成员变量
//        品牌 brand（ String 型）
//        生成所有成员变量set/get方法
//        定义抽象方法：void playMusic(String s)
//        2.定义类IPhone，要求如下：
//        继承抽象类 Phone
//        构造方法包括：空参构造和满参构造方法
//        重写抽象方法：
//        void playMusic(String s)，要求：输出打印"XXX手机正在播放歌曲:s"
//        PS：XXX是Phone类中的 brand属性值，s是传入的参数
//        3.定义测试类TestDemo，在main方法实现以下功能：
//        创建并初始化一个IPhone 对象 phone，调用phone的playMusic(String s)方法,传入参数"菊花台"
//        打印出如下语句:
//        华为手机正在播放歌曲:菊花台
public class Demo {
    public static void main(String[] args) {
        IPhone iPhone = new IPhone("华为");
        iPhone.playMusic("菊花台");
    }
}
