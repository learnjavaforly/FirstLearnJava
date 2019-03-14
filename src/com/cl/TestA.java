package com.cl;
public class TestA {
    public static void main(String[] args) {
        String code = "A01";
        for (int i = 0; i < 100; i++) {
            code =    YouBianCodeUtil.getNextYouBianCode(code);
            System.out.println(code);
        }
    }
}
