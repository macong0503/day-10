package HomeWork.Cylinder;

import HomeWork.Cylinder.C;

// 定义圆柱体类Cylinder实现接口C，
// 该类中包含三个成员变量：底圆半径radius、 圆柱体的高height、颜色color。
public class Cylinder implements C {
    int radius;
    int height;
    String color;

    public Cylinder(int radius, int height, String color) {
        this.radius = radius;
        this.height = height;
        this.color = color;
    }

    @Override
        public void volume () {
            double volume = area()*height;
            System.out.println("体积是："+volume);

        }

        @Override
        public  double area () {
            double area = radius*radius*pi;
            System.out.println("面积为："+area);
            return area;

        }

        @Override
        public void setColor (String c){
        this.color=c;
        }
        public String getColor(){
         return color;
        }
    }

