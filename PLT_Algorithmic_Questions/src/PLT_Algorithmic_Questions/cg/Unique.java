package PLT_Algorithmic_Questions.cg;

public class Unique {
	
	public static void main(String[] args) {
		String a = "cappgemine";
		for (int i = 0; i < a.length(); i++) {
			if (a.indexOf(a.charAt(i)) != a.lastIndexOf(a.charAt(i))) {
				continue;
			} else
				System.out.print(a.charAt(i) + " ");

		}
		

	}

}
