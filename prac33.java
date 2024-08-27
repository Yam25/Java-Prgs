class prac33
{
	/*
	*         *****
    **       ****
    ***    ***
    ****  **
    ******
*/
	public static void main(String[] args) 
	{
       int j;
		for(int i=1;i<=5;i++)
		{
			for(j=1; j<=i;j++)
			{
			  System.out.print("*");
			}
            for(int k=1; k<=(5-i);k++)  //2*(row-i) or try it with space
			{ 
				System.out.print(" ");
			}
           for(int l=5;l>=i;l--) //for the reverse
			{
                  System.out.print("*");
			}
		System.out.println();
		//space-=2;
		
		}
                
}
}
