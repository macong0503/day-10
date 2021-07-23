package HomeWork.Notebook;

//笔记本类，包含运行功能、关机功能、使用USB设备功能
public class notebook {

    public void run(){
        System.out.println("开机");
    }
    public void norun(){
        System.out.println("关机");
    }


    public  void gongneng(Usb usb){
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.open();
            mouse.gongneng();
            mouse.close();
        }
        if (usb instanceof Keyboard){
            Keyboard keyboard = (Keyboard) usb;
            keyboard.open();
            keyboard.gongneng();
            keyboard.close();
        }
    }
}
