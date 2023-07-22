package PLT_Algorithmic_Questions.cg;

import java.util.Arrays;

public class Anagrams {
	
//	public static boolean anagrams(String string1 ,String string2) {
//		String str1 = string1.replaceAll("//s","").toLowerCase();
//		String str2 = string2.replaceAll("//s","").toLowerCase();
//		
//		if(str1.length() != str2.length()) {
//			return false;
//		}
//		
//		
//		
//	}
	public static void main(String[] args) {
		String stt1= "hello";
		String stt2 = "oelhl";
		stt1=stt1.toLowerCase();
		stt2 = stt2.toLowerCase();
		
		if(stt1.length() ==stt2.length()) {
			char[] char1 = stt1.toCharArray();
			char[] char2 = stt2.toCharArray();
			
			Arrays.sort(char1);
			Arrays.sort(char2);
			boolean resule = Arrays.equals(char1, char2);
			if(resule) {
				System.out.println("it is an anagram");
			}else {
				System.out.println("not an anagrams");
			}
		}else {
			System.out.println("not an anagrams");
		}
		
	}
	
	
	

}
