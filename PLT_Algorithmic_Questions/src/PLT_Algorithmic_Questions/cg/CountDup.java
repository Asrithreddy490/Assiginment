package PLT_Algorithmic_Questions.cg;

import java.util.Map;
import java.util.stream.Collectors;

public class CountDup {
	public static void main(String[] args) {
		String input = "java language";

        
        Map < Character, Long > result = input
            .chars().mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        result.forEach((key, value) -> {
            if (value > 1) {
                System.out.println(key + " : " + value);
            }
        });
	}

}
