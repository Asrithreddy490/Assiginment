package PLT_Algorithmic_Questions.cg;

public class PrimeNumbers {
	public static void main(String[] args) {
		int n = 10;
		boolean flag = false;
		for(int i =2 ; i <= n/2;i++ ) {
			if(n%i ==0) {
				flag = true;
				break;
			}
		}
		if(!flag) {
			System.out.println();
		}
	}

}
