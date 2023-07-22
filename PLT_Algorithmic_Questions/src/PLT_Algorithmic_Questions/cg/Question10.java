package PLT_Algorithmic_Questions.cg;

public class Question10 {

	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		System.out.println("Using == with primitive types: " + (a == b));

		String str1 = new String("hello");
		String str2 = new String("hello");
		System.out.println("Using == with object references: " + (str1 == str2));
		System.out.println(".equals() with object references: " + str1.equals(str2));

	}

}
