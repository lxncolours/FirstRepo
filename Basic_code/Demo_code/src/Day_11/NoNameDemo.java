package Day_11;

public class NoNameDemo {
    public static void main(String[] args) {
        new InterDemo() {
            @Override
            public void show() {
                System.out.println("使用匿名内部类实现show方法");
            }

            @Override
            public void function() {
                System.out.println("使用匿名内部类实现function方法");
            }
        }.function();
        new InterDemo() {
            @Override
            public void show() {
                System.out.println("使用匿名内部类实现show方法");
            }

            @Override
            public void function() {
                System.out.println("使用匿名内部类实现function方法");
            }
        }.show();
        InterDemo id = new InterDemo() {
            @Override
            public void show() {
                System.out.println("使用另一种匿名内部类方式实现show方法");
            }

            @Override
            public void function() {
                System.out.println("使用另一种匿名内部类方式实现function方法");
            }
        };
        id.show();
        id.function();
    }
}
