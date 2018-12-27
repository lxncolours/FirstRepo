package Day_10Demo;

public class PhoneDemo {
    public static void main(String[] args) {
        MiPhone miPhone = new MiPhone();
        TPhone tPhone = new TPhone();
        usePhone(miPhone);
        System.out.println("----------------");
        usePhone(tPhone);
    }
    public static void usePhone(Phone p){
        p.call("罗永浩");
        p.sendMessage();
        if (p instanceof MiPhone){
            ((MiPhone) p).hot();
        } else if (p instanceof TPhone){
            ((TPhone) p).hit();
        }

    }
}
