package Day_02;
/*   byte b1=3,b2=4,b;
   b=b1+b2;
   b=3+4;
   哪句是编译失败的呢？为什么呢？*/
public class Test01 {
    //第三行的代码为错,因为b1和b2在参与运算的时候已经提升到了int类型,而b是byte类型,想要用b接收 b1+b2 的结果
    //需改写成b = (byte)(b1 + b2);
    }

