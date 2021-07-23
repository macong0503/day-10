import HomeWork.Notebook.Keyboard;
import HomeWork.Notebook.Mouse;
import HomeWork.Notebook.notebook;

public class Test {
    public static void main(String[] args) {
        Mouse mouse = new Mouse();
        Keyboard keyboard = new Keyboard();
        notebook n = new notebook();

        n.run();
        System.out.println("--------");
        mouse.gongneng(mouse);
        System.out.println("-------");
        keyboard.gongneng(keyboard);
        System.out.println("--------");
        n.norun();

    }
}
