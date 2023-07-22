package PLT_Algorithmic_Questions.cg;

public class LengthofInteger {
	public static void main(String[] args) {
		int a = 35274;
        int b = a;
        int count = 0;
        while(a != 0) {
            int c = a % 10;
            count += 1;
            a = a / 10;
        }
        System.out.println("Length of "+  b +" is "+count);
    }
}