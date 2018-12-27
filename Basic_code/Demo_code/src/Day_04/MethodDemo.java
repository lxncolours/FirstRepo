package Day_04;

public class MethodDemo {
    public static void main(String[] args) {
        int flows = Flows();
        System.out.println("水仙花数的个数 = " + flows);
    }

    public static int Flows() {
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                count++;
            }
        }
        return count;
    }
}
