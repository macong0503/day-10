package com.hqyj.mc.work;

public class work {
    private boolean b = true;
    public class jump {
        public void A() {
            if (b == true) {
                System.out.println("跳");
            }
            if (b == false) {
                System.out.println("不跳");
            }
        }
    }

    public boolean isB() {
        return b;
    }

    public void setB(boolean b) {
        this.b = b;
    }
}
