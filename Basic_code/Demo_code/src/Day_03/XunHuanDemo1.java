package Day_03;

public class XunHuanDemo1 {
    public static void main(String[] args) {
        for (int hour = 0; hour < 24; hour++) {
            for (int min = 0; min < 60; min++) {
                for (int s = 0; s < 60; s++) {
                    System.out.println(hour + "点" + min + "分" + s +"秒");
                }
            }
        }
    }
}
