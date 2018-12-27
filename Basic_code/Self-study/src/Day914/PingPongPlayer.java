package Day914;

public class PingPongPlayer extends Player implements LearnXiangQi{
    public PingPongPlayer() {
    }

    public PingPongPlayer(String name, int age) {
        super(name, age);
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员学抽球");
    }

    @Override
    public void eat() {
        System.out.println("兵乓球运动员跟着教练吃满汉全席");
    }

    @Override
    public void sleep() {
        System.out.println("乒乓球运动员每天睡到下午三点");
    }

    @Override
    public void learnXiangQi() {
        System.out.println("兵乓球运动员学象飞田");
    }
}
