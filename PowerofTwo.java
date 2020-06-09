package com.leetcode.week2;

public class PowerofTwo {

	public static void main(String[] args) {
		int num = 0;
		boolean flag = isPowerOfTwo(num);
		System.out.println(flag);
	}

	private static boolean isPowerOfTwo(int num) {

		if (num <= 0)
			return false;
		while (num % 2 == 0) {
			num = num / 2;
		}

		return num == 1;
	}

//	public static boolean isPowerOfTwo(int n) {
//		if(n<=0)
//			return false;
//		return (n & (n - 1)) == 0;
//	}

}
