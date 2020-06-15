package com.leetcode.week2;

public class CheapestFlightsWithinKStops {

	public static void main(String[] args) {
		int ncities = 3;
		int src = 0;
		int dst = 2;
		int k = 1;
		int edges[][] = new int[][] { { 0, 1, 100 }, { 1, 2, 100 }, { 0, 2, 500 } };

		Solution solutions = new Solution();
		int cheapestPrice = solutions.findCheapestPrice(ncities, edges, src, dst, k);
		System.out.println(cheapestPrice);
	}

}
