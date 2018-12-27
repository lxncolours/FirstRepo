package Day_03;

public class Test01 {
        public static void main(String[] args) {
            int i =2;
            if (1 <= i && i <= 2) {
                System.out.println(i +"月是冬季");
            } else if (3 <= i && i<= 5) {
                System.out.println(i + "月是春季");
            } else if (6 <= i && i <= 8){
                System.out.println(i + "月是夏季");
            } else if (9 <= i && i <= 11){
                System.out.println(i + "月是秋季");
            } else if (i == 12){
                System.out.println(i + "月是冬季");
            } else {
                System.out.println("数据错误");
            }
        }
    }


