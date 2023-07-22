package PLT_Algorithmic_Questions.cg;

public class Palindrome {
	public static void main(String[] args) {
		String original = "asdffdsa";
		String reverse = "";
		int length = original.length();
		for(int i = length-1; i >=0 ; i--) {
			reverse = reverse + original.charAt(i);
		}
		if(reverse.equalsIgnoreCase(original)) {
			System.out.println("given word " + original + " is a palendrome");
		}else {
			System.out.println("given word " + original + " is not a palendrome");
		}
	

	}
}
