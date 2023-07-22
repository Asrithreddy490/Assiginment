package PLT_Algorithmic_Questions.cg;

import java.util.Arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int list[] = {22,33,44,555,323,666,333,345};
		int size = list.length;
		Arrays.sort(list);
		System.out.println("given array is " + Arrays.toString(list));
		int secondmax = list[size-2];
		System.out.println("second highest number from array is " + secondmax);
	}
}
