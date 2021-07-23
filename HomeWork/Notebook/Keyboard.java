package HomeWork.Notebook;

//键盘类，要实现USB接口，具备敲击的方法
public class Keyboard extends notebook implements Usb{
    @Override
    public void open() {
        System.out.println("键盘已连接");
    }

    @Override
    public void close() {
        System.out.println("键盘断开连接");
    }



    public void gongneng() {
        System.out.println("我可以敲击");
    }
}
