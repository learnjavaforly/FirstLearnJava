package com.cl;
import java.util.Arrays;

public class Test9 {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] c = new int[9];
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
			if (i != 0)
				c[0] += a[i];
		}
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(c));

	}
}
