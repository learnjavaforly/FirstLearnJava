package com.cl;
public class Test4 {
    public static void test(Double k, Double b, Double a, Double c, Double r) {
        //y = kx+b;
        //(x + a )2 + (y+c)2 = r2
        //(x+a)2 +( kx+b+c)2 = r2

        Double d = b + c;
        //(x+a)2 +(kx+d)2 = r2
        // x2 + 2ax + a2 + k2x2+2kdx+d2 = r2;
        //(k2+1)x2 + (2a+2kd)x= r2-a2-d2;
        Double f = Math.pow(k, 2) + 1;
        Double g = 2 * a + 2 * k * d;
        Double h = Math.pow(r, 2) - Math.pow(a, 2) - Math.pow(d, 2);
        //fx2+gx=h
        //(x+(g/2f))2=h/f+(g/2f)2;
        Double q = g / (2 * f);
        Double w = h / f + Math.pow(q, 2);
        //(x+q)2=w
        Double x1 = Math.sqrt(w) - q;
        Double x2 = -Math.sqrt(w) - q;
        Double y1 = k * x1 + b;
        Double y2 = k * x2 + b;
    }

    public static void main(String[] args) {
        test(1D, 0D, 0D, 0D, 2D);
    }
}
