package PLT_Algorithmic_Questions.cg;

public class OccuranceofA {
	public static void main(String[] args) {
		String a = "capgemini";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 65 || a.charAt(i) == 97) {
				count++;
			}
		}

		System.out.println("a occured is: "+count+" times");
	}
}
