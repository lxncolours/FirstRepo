package Day_10.Test04;

public class IPhone extends Phone implements Bluetooth {
    public IPhone() {
    }

    public IPhone(String name) {
        super(name);
    }

    @Override
    public void btFunction() {
        System.out.println("支持WIFI功能");
    }


    @Override
    public void playMusic(Song song) {
        System.out.println(getName() + "手机正在播放" + song.getSinger() + "唱的" + song.getName());
    }
}
