package PLT_Algorithmic_Questions.cg;

public class Pyramid {
	public static void main(String[] args) {
	//	int n= 5;
		for(int i = 1 ; i<=4 ; i++) {
			for(int j = 4;j>=i; j--) {
				System.out.print(" ");
			}
			for(int k = 1 ; k<=i; k++) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
