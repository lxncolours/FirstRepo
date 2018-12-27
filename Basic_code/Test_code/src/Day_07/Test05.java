package Day_07;

import java.util.ArrayList;
import java.util.Scanner;

/*4.键盘多次录入学生成绩（录入-1代表录入结束）
        录入结束后，计算出，录入的学生的成绩之和 和  班级成绩的平均值*/
public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        double count = 0;
//        ArrayList<Integer> score = new ArrayList<>();
        while (true) {
            System.out.println("请输入一个成绩");
            int i = sc.nextInt();
            if (i == -1) {
                break;
            } else {
//                score.add(i);
//                sum += score.get(count);  需求只是求和,所以此处并不一定要用容器装起来
                sum += i;
                count++;
            }

        }
        System.out.println("全班的成绩总和为" + sum);
        double pingjunshu = sum / count;
        System.out.println("平均数为" + pingjunshu);
    }
}
