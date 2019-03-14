package com.cl;
import static java.lang.Math.abs;

public class Test2 {
    public static void main(String[] args) {
        Point pt = new Point(2D, 2D, 0D);
        Point begin = new Point(1D, 1D, 0D);
        Point end = new Point(3D, 1D, 0D);
        System.out.println(test(pt, begin, end));
    }

    public static Point test(Point pt, Point begin, Point end) {
        Point retVal = new Point();

        double dx = begin.x - end.x;
        double dy = begin.y - end.y;
        double dz = begin.z - end.z;
        if (abs(dx) < 0.00000001 && abs(dy) < 0.00000001 && abs(dz) < 0.00000001) {
            retVal = begin;
            return retVal;
        }

        double u = (pt.x - begin.x) * (begin.x - end.x) +
                (pt.y - begin.y) * (begin.y - end.y) + (pt.z - begin.z) * (begin.z - end.z);
        u = u / ((dx * dx) + (dy * dy) + (dz * dz));

        retVal.x = begin.x + u * dx;
        retVal.y = begin.y + u * dy;
        retVal.y = begin.z + u * dz;
        return retVal;
    }
}