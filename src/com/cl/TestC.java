package com.cl;
import java.util.Scanner;
import java.util.Arrays;

public class TestC {

    public static void main(String[] args) {
        // ��10������������鲢������Ӧ������
        System.out.println("������10������:");
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int sum = 0;//���
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[10];
        int Aindex = 0;
        int Bindex = 0;
        int Cindex = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("�������" + (i + 1) + "������:");
            int control = input.nextInt();
            //��������Ԫ�صĺ�
            num[i] = control;
            sum += control;
            //���鸴��
            if (i % 2 == 0) {
                A[Aindex] = num[i];
                Aindex++;
            } else {
                B[Bindex] = num[i];
                Bindex++;
            }
            if (Cindex == 0) {
                C[i] = num[i];
                int value = num[i];
                C[0] += num[i];
                Cindex++;
            }
        }
        System.out.println("����C����Ϊ:" + Arrays.toString(C));
        System.out.println("����num����Ϊ:" + Arrays.toString(num));
        System.out.println("num��������Ԫ�صĺ�:" + sum);
        System.out.println("�±�ż������A:" + Arrays.toString(A));
        System.out.println("�±���������B:" + Arrays.toString(B));

        //num��������ֵ��Сֵ
        int max = num[0];//��������ĵ�һ����ΪMax
        int min = num[0];//��������ĵ�һ����ΪMin
        for (int j = 1; j < num.length; j++) {
            if (max < num[j]) {
                max = num[j];
            }
            if (min > num[j]) {
                min = num[j];
            }
        }
        System.out.println("num��������ֵΪ:" + max);
        System.out.println("num�������СֵΪ:" + min);
    }

}

