package PLT_Algorithmic_Questions.cg;

public class FindLength {
public static void main(String[] args) {
	String str="This is hello world";
	  System.out.println("length of helloWorld string :"+Findlengthwithoutlength(str));
	  }
	 
	public static int Findlengthwithoutlength(String str)
	 {
	  int length=0;
	  char[] CharArray=str.toCharArray();
	  for(char c:CharArray)
	  {
	   length++;
	  }
	  return length;
	 
}
}
