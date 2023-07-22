package PLT_Algorithmic_Questions.cg;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
	
	
	public static void main(String[] args) {
		String a1 = "asdf", a2 = "fdsa";

        // reversing string s1...
        String rev = Stream.of(a1.toLowerCase()).map(i -> new StringBuilder(i).reverse()).collect(Collectors.joining());

        if(rev.equals(a2)) {
        	System.out.println("Given strings are reverse to eachother");
        }
        else {
        	System.out.println("Given strings are not reverse to eachother");
        }
    }
}