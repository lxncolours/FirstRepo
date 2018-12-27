package Day_06;

public class PcDemo {
    public static void main(String[] args) {
        Pc xiaomi = new Pc();
        xiaomi.brand = "小米";
        xiaomi.color = "深空灰";
        xiaomi.cpu = "I7 8750H";
        xiaomi.gpu = "GTX 1060 6G";
        xiaomi.price = 8799;
        xiaomi.size = 15.6;
        xiaomi.pc("微信");
        System.out.println(xiaomi.brand);
        System.out.println(xiaomi.color);
        System.out.println(xiaomi.cpu);
        System.out.println(xiaomi.gpu);
        System.out.println(xiaomi.price);
        System.out.println(xiaomi.size);
    }
}
