package Day914;

public class PingPongCoach extends Coach implements LearnXiangQi{
    public PingPongCoach() {
    }

    public PingPongCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练教抽球");
    }

    @Override
    public void eat() {
        System.out.println("乒乓球教练吃满汉全席");
    }

    @Override
    public void sleep() {
        System.out.println("乒乓球教练睡到下午三点");
    }

    @Override
    public void learnXiangQi() {
        System.out.println("兵乓球教练学马走日~");
    }
}
