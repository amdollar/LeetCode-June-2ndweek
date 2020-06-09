package com.leetcode.week2;

public class IsSubsequence {

	public static void main(String[] args) {
		String str = new String("abc");
		String te = new String("ahbbgdc");
		System.out.println(isSubsequence(str, te));
	}

	public static boolean isSubsequence(String s, String t) {

		int tlen = t.length() - 1;
		int slen = s.length() - 1;
		int tpointer = 0;
		int spointer = 0;
		if (s.length() == 0 || (s.length() == 0 && t.length() == 0))
			return true;

		while (tpointer <= tlen && spointer <= slen) {
			if (t.charAt(tpointer) != s.charAt(spointer)) {
				tpointer++;
			} else {
				tpointer++;
				spointer++;
			}
		}
		if (spointer == (slen + 1))
			return true;

		return false;
	}
}
