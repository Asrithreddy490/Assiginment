package PLT_Algorithmic_Questions.cg;

public class Armstrong {
	public static void main(String[] args) {
		int a = 270;
        int b = a;
        int sum = 0;
        while(a>0) {
            int r = a % 10;
            sum += r * r * r;
            a = a / 10;
        }

        if(sum == b) {
            System.out.println(b+ " is armstrong num");
        }else {
            System.out.println(b+ " not an armstrong num");
        }
    }
}