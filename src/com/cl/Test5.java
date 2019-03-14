package com.cl;
public class Test5 {
    public static void test(Double a,Double b,  Double c) {
        Double a2 = Math.pow(a,2);
        Double b2 = Math.pow(b,2);
        Double c2 = Math.pow(c,2);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);

        Double cosVal = (b2 + c2 - a2) / (2 * b * c);
        System.out.println(cosVal);
        System.out.println(Math.acos(cosVal)*180/Math.PI);
    }

    public static void main(String[] args) {
        test(1.414D, 1D, 1D);
    }
}
