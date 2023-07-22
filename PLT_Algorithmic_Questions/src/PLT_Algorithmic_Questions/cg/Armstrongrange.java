package PLT_Algorithmic_Questions.cg;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Armstrongrange {
	public static void main(String[] args) {
        List<Integer> res = IntStream.range(1, 400).boxed().filter(Armstrongrange::Armstrong).collect(Collectors.toList());
        System.out.println(res);
    }

	private static boolean Armstrong(int n) {
        int m = n;
        int sum = 0;
        while(n>0) {
            int r = n % 10;
            sum += r * r * r;
            n = n / 10;
        }

        if(sum != m) return false;
        else return true;
    }
}