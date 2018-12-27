package Day914;

public class BasketBallPlayer extends Player implements LearnEnglish{
    public BasketBallPlayer() {
    }

    public BasketBallPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("篮球运动员学扣篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球运动员吃馍馍");
    }

    @Override
    public void sleep() {
        System.out.println("篮球运动员不睡觉");
    }

    @Override
    public void learnEnglish() {
        System.out.println("篮球运动员学ByeBye~");
    }
}
