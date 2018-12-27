package Day_11.Test01;

public class IPhone extends Phone{
    public IPhone() {
    }

    public IPhone(String brand, String price) {
        super(brand, price);
    }

    @Override
    public void sell() {
        System.out.println("名称为"+getBrand()+"的手机售价"+getPrice()+",真心贵.");
    }
    private void light(){
        System.out.println(getBrand()+"手机刚开始没手电筒");
    }
    private void dark(){
        System.out.println("晚上太TM黑了,内衣都走丢了");
    }
    public void effect(){
        light();
        dark();
    }
}
