package PLT_Algorithmic_Questions.cg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SumofEvenOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter numbers");
		int n = input.nextInt();

	    int[] numbers = new int[n];

	    int Even = 0, Odd = 0;

	    System.out.print("Enter " + n + " integers: ");

	    for (int i = 0; i < n; i++) {
	    	numbers[i] = input.nextInt();
	    }
	    for( int i = 0 ; i <n ;i++) {
	    	if(numbers[i] % 2 ==0) {
	    		Even = numbers[i]+Even;
	    	}else {
	    		Odd =  numbers[i]+Odd;
	    	}
	    }
	    
	    System.out.println(Even);;
	    System.out.println(Odd);
	    
	    
	    
	
	

	}
	
}
