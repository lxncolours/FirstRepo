package Day_05;
/*	1.定义一个包含五个元素的int类型的数组。数组元素自己给出
            2.将数组当中数据小于10的打印出来
            如果存在，则打印出来，具体的数据
            如果不存在，则打印出来，未找到合适的数据*/
public class Test03 {
    public static void main(String[] args) {
        int [] arry ={132,12,44,12,12};
        int count = 0;
        for (int i = 0; i < arry.length; i++) {
            if (arry[i] < 10){
                System.out.println(arry[i]);
                count++;
            }
        }
        if(count < 1){
            System.out.println("未找到合适的数据");
        }
    }
}
