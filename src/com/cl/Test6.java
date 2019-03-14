package com.cl;
public class Test6 {
    public static void main(String[] args) {
        //调用方法  输出十次空格
        doPrint(" ", 10);
        System.out.println("1, 幸 运 大 放 送");
        //调用方法  输出二十次  空格|空格
        doPrint(" | ", 20);
        System.out.println("1, 幸 运 大 放 送");
        doPrint(" ", 10);
        System.out.println("1, 幸 运 大 放 送");
    }

    /**
     * 输出number次msg
     *
     * 当前方法为静态方法 可以在当前类中直接通过方法名调用
     *
     * @param msg 需要输出的信息
     * @param number 循环的次数
     */
    public static void doPrint(String msg, int number) {
        int index = 0;
        while (index < number) {
            System.out.print(msg);
            index++;
        }
    }
}
