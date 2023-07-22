package PLT_Algorithmic_Questions.cg;

public class DimondWithnum {
	public static void main(String[] args) {
		int r =5;
		for(int i=0;i<=r;i++)
		   {
		     for(int j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(int k=1;k<=2*i-1;k++)
		       System.out.print(k);
		     System.out.print("\n");
		   }
		 
		   for(int i=r-1;i>=1;i--)
		   {
		     for(int j=1;j<=r-i;j++)
		     System.out.print(" ");
		     for(int k=1;k<=2*i-1;k++)
		       System.out.print(k);
		     System.out.print("\n");
		   }	
	}

}