package HomeWork.Notebook;

//鼠标类，要实现USB接口，并具备点击的方法
public class Mouse extends notebook implements Usb{
    @Override
    public void open() {
        System.out.println("鼠标已连接");
    }

    @Override
    public void close() {
        System.out.println("鼠标断开连接");
    }




    public void gongneng() {
        System.out.println("我可以点击");
    }
}
