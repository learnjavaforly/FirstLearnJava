package com.cl;
public class Test3 {
    public static void main(String[] args) {
//        test(0, 0, -2, -1, 1);
        Point p1 = new Point(0D, 0D);
        Point p2 = new Point(4D, 4D);
        Point p = new Point(2D, 0D);
        Double r = 1D;
        test3(p1, p2);
    }

    public static void test1(Point p1, Point p2, Point p, Double r) {
        Double k = (p2.y - p1.y) / (p2.x - p1.x);
        Double b = (-(p2.y - p1.y) * p1.x + (p2.x - p1.x) * p1.y) / (p2.x - p1.x);
        Double c = -p.x;
        Double d = -p.y;
        System.out.println("y=" + k + "x+" + b);
        test(k, b, c, d, r);

    }

    public static void test(Double k, Double b, Double c, Double d, Double r) {
        Double base = square(k) + 1;

        Double x_sqrt = base * square(r) + square(c) * square(k) + (2 * c * d + 2 * b * c) * k - square(d) - 2 * b * d - square(b);
        Double y_sqrt = square(k) * square(r) + square(r)
                - square(c) * square(k) + 2 * c * d * k + 2 * b * c * k - square(d) - 2 * d * b - square(b);

        Double x1_head = Math.sqrt(x_sqrt) + (d + b) * k + c;
        Double x1 = -x1_head / base;

        Double y1_head = k * x_sqrt + d * square(k) - b;
        Double y1 = -y1_head / base;

        Double x2_head = x_sqrt + (-d - b) * k - c;
        Double x2 = x2_head / base;

        Double y2_head = k * (c - y_sqrt) + d * square(k) - b;
        Double y2 = -y2_head / base;

        System.out.println(x1 + "," + y1);
        System.out.println(x2 + "," + y2);

    }

    public static Double square(Double number) {
        return Math.pow(number, 2);
    }

    public static void test3(Point p1, Point p2) {
        Double k = (p2.y - p1.y) / (p2.x - p1.x);
        Double b = (-(p2.y - p1.y) * p1.x + (p2.x - p1.x) * p1.y) / (p2.x - p1.x);
        Double k_ = -(1 / k);
        Double b1 = p1.y - k_ * p1.x;
        Double b2 = p2.y - k_ * p2.x;
        System.out.println("y=" + k + "x+" + b);
        System.out.println("y=" + k_ + "x+" + b1);
        System.out.println("y=" + k_ + "x+" + b2);
    }
}
