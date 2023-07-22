package PLT_Algorithmic_Questions.cg;

import java.util.HashMap;

public class CharCount {
	public static void main(String[] args) {
		HashMap<Character, Integer> hashmap =new HashMap<>();
		String keywords = "capppgemini";
		for(int i = (keywords.length()-1);i>=0;i--) {
			if(hashmap.containsKey(keywords.charAt(i))) {
				
				int counts = hashmap.get(keywords.charAt(i));
				hashmap.put(keywords.charAt(i), ++counts);				
			}else {
				hashmap.put(keywords.charAt(i), 1);
			}
		}System.out.println(hashmap);
	}

}
