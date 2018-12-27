package Day_09.Test04Demo;

public class IPhone extends Phone{
    public IPhone() {
    }

    public IPhone(String brand) {
        super(brand);
    }


    @Override
    public void playMusic(String s) {
        System.out.println(super.getBrand()+"正在播放歌曲:"+s);
    }
}
