package Day_10.Test07;

public class Laptop {
    public void run (){
        System.out.println("电脑正在运行");
    }
    public void useUSB(USB usb){
        if (usb != null){
            usb.open();
            if (usb instanceof Mouse){
                ((Mouse) usb).click();
            }else if (usb instanceof KeyBoard){
                ((KeyBoard) usb).knock();
            }else {
                usb.close();
            }
        }
    }
    public void powerOff(){
        System.out.println("电脑关机了");
    }

}
