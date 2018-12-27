package Day_10Demo;

public class MiPhone implements Phone {



    @Override
    public void call(String name) {
        System.out.println("给"+name+"打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("小米手机发短信");
    }

    public void hot(){
        System.out.println("小米手机是暖手宝");
    }
}
