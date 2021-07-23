package HomeWork.Jisuanqi;

import HomeWork.Jisuanqi.Compute;

public class Ride implements Compute {
    @Override
    public int computer(int n, int m) {
        System.out.print(n+"*"+m+"=");
        return n*m;
    }

}
