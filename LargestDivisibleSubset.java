package com.leetcode.week2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LargestDivisibleSubset {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3 };
		List<Integer> res = largestDivisibleSubset(arr);
		for (int i : res) {
			System.out.println(i + " ");
		}
	}

	public static List<Integer> largestDivisibleSubset(int[] nums) {
		int n = nums.length, maxIdx = 0;
		List<Integer> ans = new LinkedList<>();
		if (n == 0)
			return ans;
		Arrays.sort(nums);
		int[] lens = new int[n], prevs = new int[n];
		Arrays.fill(prevs, -1);
		for (int i = 0; nums[i] <= nums[n - 1] / 2; ++i) {
			for (int j = i + 1, f = 2; nums[i] <= nums[n - 1] / f; f = (nums[j] + nums[i] - 1) / nums[i]) {
				int idx = Arrays.binarySearch(nums, j, n, f * nums[i]);
				if (idx > 0 && lens[idx] <= lens[i]) {
					prevs[idx] = i;
					lens[idx] = lens[i] + 1;
					if (lens[idx] > lens[maxIdx])
						maxIdx = idx;
				}
				j = idx >= 0 ? idx + 1 : -(idx + 1);
				if (j >= n)
					break;
			}
		}
		for (int i = maxIdx; i >= 0; i = prevs[i])
			ans.add(0, nums[i]);
		return ans;
	}

}
