package Day_02;
//定义一个学成成绩,数值自己决定,当成绩大于等于60输出true,否则输出false
public class Test09 {
    public static void main(String[] args) {
        int i = 90;
        if(0 <= i && i <= 100){
            if(i >= 60){//当大于等于60的时候输出true
                System.out.println(true);
            }else{//当不满足时输出false
                System.out.println(false);
            }
        }
    }
}
