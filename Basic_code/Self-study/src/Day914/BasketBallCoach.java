package Day914;

public class BasketBallCoach extends Coach implements LearnEnglish {
    public BasketBallCoach() {
    }

    public BasketBallCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("篮球教练教扣篮");
    }

    @Override
    public void eat() {
        System.out.println("篮球教练吃馍馍");
    }

    @Override
    public void sleep() {
        System.out.println("篮球教练不睡觉");
    }

    @Override
    public void learnEnglish() {
        System.out.println("篮球教练学Hello~");
    }
}
