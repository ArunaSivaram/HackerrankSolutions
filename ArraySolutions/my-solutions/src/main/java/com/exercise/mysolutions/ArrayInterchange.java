package com.exercise.mysolutions;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInterchange {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[][] = new int[4][4];
		for (int arr_i = 0; arr_i < 4; arr_i++) {
			for (int arr_j = 0; arr_j < 4; arr_j++) {
				arr[arr_i][arr_j] = in.nextInt();
			}
		}
		interChange0to1(arr);
	}

	public static void interChange0to1(int[][] arr) {
		int xcord = Integer.MIN_VALUE, ycord = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i][j] == 0) {
					xcord = i;
					ycord = j;
					break;

				}
			}
		}

		if (xcord != Integer.MIN_VALUE && ycord != Integer.MIN_VALUE) {
			for (int k = 0; k < arr.length; k++) {
				arr[xcord][k] = 0;
				arr[k][ycord] = 0;

			}
		}

		System.out.println(Arrays.deepToString(arr));

	}
}
