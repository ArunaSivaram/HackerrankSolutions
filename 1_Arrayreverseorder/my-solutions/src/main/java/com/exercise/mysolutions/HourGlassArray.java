package com.exercise.mysolutions;

import java.util.Scanner;

public class HourGlassArray {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int arr[][] = new int[6][6];
	        for(int arr_i=0; arr_i < 6; arr_i++){
	            for(int arr_j=0; arr_j < 6; arr_j++){
	                arr[arr_i][arr_j] = in.nextInt();
	            }
	        }
	        
	        displayGreatestHourGlassSum(arr);
	    }
	 
	 
	 public static void displayGreatestHourGlassSum(int arr[][])
	 {
		 int max = Integer.MIN_VALUE;
		 int finalMax = Integer.MIN_VALUE;
		 if(arr != null && arr.length > 0)
		 {
			 for(int i=0;i<4;i++)
			 {
				 for(int j=0;j<4;j++)
				 {
					 max = findSum(arr,i,j);
					 finalMax = max > finalMax ? max : finalMax;
				 }
			 }
		 }
		 System.out.println(finalMax);
	 }
	 
	 public static int displayGreatestSum(int arr[][])
	 {
		 int max = Integer.MIN_VALUE;
		 int finalMax = Integer.MIN_VALUE;
		 if(arr != null && arr.length > 0)
		 {
			 for(int i=0;i<4;i++)
			 {
				 for(int j=0;j<4;j++)
				 {
					 max = findSum(arr,i,j);
					 finalMax = max > finalMax ? max : finalMax;
				 }
			 }
		 }
		 return finalMax;
	 }
	 
	 private static int findSum(int arr[][], int i,int j)
	 {
		 int sum = arr[i][j] +arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
		 return sum;
	 }
}
