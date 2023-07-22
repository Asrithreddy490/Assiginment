package PLT_Algorithmic_Questions.cg;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PrintNonRepeat {
	
	public static void main(String[] args) {
		List<Integer> list =Arrays.asList(1,2,2,4,5,6,6,7,7,8,8);
		
		 Predicate<Integer> isNonRepeated = digit -> list.stream()
	                .filter(num -> num == digit)
	                .count() == 1;
		 
		 List<Integer> List2 = list.stream().distinct().filter(isNonRepeated).collect(Collectors.toList());
		 System.out.println(List2);
		 
	}

}
