package HomeWork.Jisuanqi;

import HomeWork.Jisuanqi.Compute;

public class Add implements Compute {
    @Override
    public int computer(int n, int m) {
        System.out.print(n+"+"+m+"=");
        return m+n;
    }

}
