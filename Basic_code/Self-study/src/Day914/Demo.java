package Day914;

public class Demo {
    public static void main(String[] args) {
        BasketBallCoach bbc = new BasketBallCoach("姚明", 30);
        System.out.println(bbc.getName() + "   " + bbc.getAge());
        bbc.eat();
        bbc.sleep();
        bbc.teach();
        bbc.learnEnglish();
        BasketBallPlayer bbp = new BasketBallPlayer("孙悦", 23);
        System.out.println(bbp.getName() + "   " + bbp.getAge());
        bbp.eat();
        bbp.sleep();
        bbp.study();
        bbp.learnEnglish();
        PingPongCoach ppc = new PingPongCoach("刘胖子", 50);
        System.out.println(ppc.getName() + "   " + ppc.getAge());
        ppc.eat();
        ppc.sleep();
        ppc.teach();
        ppc.learnXiangQi();
        PingPongPlayer ppp = new PingPongPlayer("马龙", 20);
        System.out.println(ppp.getName() + "   " + ppp.getAge());
        ppp.eat();
        ppp.sleep();
        ppp.study();
        ppp.learnXiangQi();
    }
}
