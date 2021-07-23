package HomeWork.Cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(2, 3, "red");
        c.volume();
        System.out.println("颜色是："+c.getColor());
    }
}
