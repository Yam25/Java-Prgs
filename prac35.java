class prac35
{
/*	
******
****  **
***    ***
**      ****
*        *****
*/
	public static void main(String[] args) 
	{
       int j;
		for(int i=1;i<=5;i++)
		{
			for(j=5; j>=i;j--)
			{
			  System.out.print("*");
			}
            for(int k=1; k<=i-1;k++)  //2*(i-j-1)
			{
				System.out.print(" ");
			}
           for(int l=1;l<=i;l++) 
			{
                  System.out.print("*");
			}
		System.out.println();
		
		
		}
                
}
}
