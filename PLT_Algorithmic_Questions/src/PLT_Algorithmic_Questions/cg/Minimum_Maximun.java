package PLT_Algorithmic_Questions.cg;

import java.util.Arrays;
import java.util.List;

public class Minimum_Maximun {

	public static void main(String[] args) {

        
        List<Integer> list3 = Arrays.asList(1,2,4,44,54);
        int maximum = list3.stream().max(Integer::compareTo).get();
        int minimum = list3.stream().min(Integer::compareTo).get();

        System.out.println("Max element in the list: "+maximum);
        System.out.println("Min element in the list: "+minimum);
    }
}
