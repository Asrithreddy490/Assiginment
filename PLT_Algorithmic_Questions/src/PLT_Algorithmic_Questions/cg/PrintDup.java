package PLT_Algorithmic_Questions.cg;

public class PrintDup {
	public static void main(String[] args) {
		String string = "java is coding language";
		char[] chr = string.toCharArray();
		for(int i = 0 ; i< string.length(); i++) {
			for(int j = i+1;j < string.length();j++) {
				if(chr[i] == chr[j]) {
					System.out.print(chr[j] + " ");
					break;
				}
			}
		}
	}

}
