package HomeWork.Jisuanqi;

public class Test {
    public static void main(String[] args) {
        UseCompute u = new UseCompute();
        Add add = new Add();
        Reduce reduce = new Reduce();
        Ride ride = new Ride();
        Except exceot = new Except();

        u.useCom(add,6,2);
        u.useCom(reduce,6,2);
        u.useCom(ride,6,2);
        u.useCom(exceot,6,2);

    }
}
