package Demo1;

public class Demo {
    public static void main(String[] args) {
        int qb = 100;
        if (qb > 100){
            System.out.println("充值使你更强大");
        }else{
            System.out.println("此功能为VIP独占");
        }
        int yb = 10;
        int renpin = 50;
        if (yb > 100){
            if (renpin > 50){
                System.out.println("恭喜你抽中了");
            }else{
                System.out.println(" 下次就能抽中了");
            }        }else{
            System.out.println("gameover");
        }
    }
}
