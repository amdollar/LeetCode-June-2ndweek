package com.leetcode.week2;

public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] arr = new int[] {1};
		int target = 2;
		System.out.println(searchInsert(arr, target));

	}

	public static int searchInsert(int[] nums, int target) {

		int len = nums.length - 1;
		for (int i = 0; i <= len; i++) {
			if (target <= nums[i])
				return i;
		}
		return len + 1;
	}

}
