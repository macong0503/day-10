package HomeWork.Cylinder;

import HomeWork.Cylinder.A;
import HomeWork.Cylinder.B;

//定义接口C，该接口继承了接口A和B，里面包含抽象方法void volume()
public interface C extends A,B {
    public abstract void volume();
}
