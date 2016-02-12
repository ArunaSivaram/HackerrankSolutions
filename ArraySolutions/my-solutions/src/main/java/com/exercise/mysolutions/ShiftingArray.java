package com.exercise.mysolutions;

import java.util.ArrayList;
import java.util.List;

public class ShiftingArray {

	public static void main(String args[]) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(shift(list).toString());
	}

	public static <T> List<T> shift(List<T> list) {
		int i, j;
		for (i = 1, j = list.size() / 2; j < list.size(); i += 2, j++) {
			T toMove = list.get(j);
			T last = null;
			for (int k = i; k < j; k++) {

				T next = (last == null) ? list.get(k) : last;
				last = list.get(k + 1);
				list.set(k + 1, next);
			}
			list.set(i, toMove);
		}
		return list;
	}

}
