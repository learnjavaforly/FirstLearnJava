package com.cl;
import java.io.IOException;

public class Test8 {
    public static void main(String[] args) {
        try {
            int in_num = System.in.read();    //获取的是一个字节的int类型
            System.out.println("控制台输入" + (char) in_num);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
