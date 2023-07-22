package PLT_Algorithmic_Questions.cg;

public class Vowles {
	public static void main(String[] args) {
		System.out.println("count vowels in given sentense ");
			String stri = "capgemini is an franch based it company";
			System.out.println("given sentense is " + stri);
			int count =0,count1 =0,count2=0;
			//int 
			for(int i = 0;i<stri.length();i++) {
				char ch = stri.charAt(i);
				if((ch=='a') || (ch=='e') || (ch=='i')||(ch=='o') || (ch=='u')) {
					count ++;
				}else {
					if(ch ==' ') {
						count1++;
						
					}
					else {
						count2++;
					}
						
				}
			}
			System.out.println("number of vowels in given sentense are " +count);
			System.out.println("number of spaces in given sentense are " +count1);
			System.out.println("number of consonents in given sentense are " + count2);

		

	}

}
	