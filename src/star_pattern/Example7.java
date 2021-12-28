package star_pattern;

public class Example7 {

	public static void main(String[] args) {
		// reverse mountain
		 
	        
	        // *********
            //	*******
            //   *****
            //    ***
            //	   *
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
