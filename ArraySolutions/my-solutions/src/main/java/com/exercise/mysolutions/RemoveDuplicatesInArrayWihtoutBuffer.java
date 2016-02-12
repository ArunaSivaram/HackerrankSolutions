package com.exercise.mysolutions;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesInArrayWihtoutBuffer {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		char[] charArray = input.toCharArray();			
		System.out.println(Arrays.toString(removeDuplicates(charArray)));
	}
	
	
	//Brute force (o(n^2))
	public static char[] removeDuplicates(char[] charArray)
	{
		boolean[] isSame = new boolean[charArray.length];
		if(charArray == null)
			return charArray;
		if(charArray.length <= 0)
			return charArray;
		if(charArray.length <2)
			return charArray;
		
		int same = 0;
		for(int i=0;i<charArray.length-1;i++)
		{
			for(int j=i+1;j<charArray.length;j++)
			{
				
				if(charArray[i]==charArray[j])
				{
					same = same + 1;
					isSame[j]=true;
					
					
					
				}
				System.out.println("Same" +same+charArray[i]+charArray[j]+isSame[j]);
			}
		}
		System.out.println("Same" +same);
		char[] resultArrayWithoutDuplicates = new char[charArray.length - (same-1)];
		int count=0;
		for(int i=0;i<isSame.length;i++)
		{
			
			if(isSame[i]==true)
				continue;
			else
			{
				
				resultArrayWithoutDuplicates[count] = charArray[i];
				count++;
			}
		}
		
		return resultArrayWithoutDuplicates;
		
	}
}
