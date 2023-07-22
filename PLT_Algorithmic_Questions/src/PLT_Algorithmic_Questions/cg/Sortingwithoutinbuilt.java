package PLT_Algorithmic_Questions.cg;

import java.util.Arrays;

public class Sortingwithoutinbuilt {
	public static void main(String[] args) {
		int sort[]= {2,4,0,1,56,23,4};
		int temp = 0;
		System.out.println("before sorting "+Arrays.toString(sort));
		for(int i = 0 ; i<sort.length;i++) {
			for(int j =i+1;j<sort.length;j++) {
				if(sort[i]>sort[j]) {
					temp=sort[i];
					sort[i]=sort[j];
					sort[j]=temp;
				}
			}
		}
		//for(int i =0;i<sort.length;i++) {
		System.out.println("after sorting "+Arrays.toString(sort));
	}
}
