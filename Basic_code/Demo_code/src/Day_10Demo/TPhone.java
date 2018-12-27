package Day_10Demo;

public class TPhone implements Phone{




    @Override
    public void call(String name) {
        System.out.println("给"+name+"打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("锤子手机发短信");
    }

    public void hit(){
        System.out.println("锤子手机砸核桃");
    }
}
