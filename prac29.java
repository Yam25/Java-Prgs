class prac29
{
	/*
	    *
      **
    ***
  ****
***** with numbers
*/
	public static void main(String[] args) 
	{
		
      int space = 4; 
	  char c= 'Z';
		for(int i=1;i<=5;i++)
		{
			
		   for(int k=1;k<=space;k++)
			{
			  System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(c--);
			}
				
			System.out.println();
			space--;
		}
}
}