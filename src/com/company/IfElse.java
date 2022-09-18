package com.company;

public class IfElse {

    public void isTriangle(int a, int b) {

        int c = 180 - a - b;
        if (c > 0) {
            System.out.println("Треугольник существует");
            if (c == 90 || a == 90 || b == 90) {
                System.out.println("Треугольник прямоугольный");
            }
        } else {
            System.out.println("Треугольник не существует");
        }
    }


    public boolean isline(int x1, int y1, int x2, int y2, int x3, int y3) {
        if ((x2 - x1) / (y2 - y1) == (x3 - x1) / (y3 - y1)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean brick(int A, int B, int x, int y, int z) {
        if (A + B > x + y || A + B > x + z || A + B > y + z) {
            return true;
        } else {
            return false;
        }
    }

    public double function(int x) {
        if (x <= 3) {
            return x * x - 3 * x + 9;
        } else {
            return 1 / (x * x * x + 6);
        }
    }

}
