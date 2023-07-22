package PLT_Algorithmic_Questions.cg;

import java.util.Scanner;

public class Question16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length: ");
		int n = sc.nextInt();
		System.out.println("\n");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		int sum = 0;
		for(int i: arr) {
			sum +=i;
		}
		System.out.println("Average is : "+sum/n);
	
	}
}
