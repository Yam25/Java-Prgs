class prac30
{
	/*
	*                  *
    **             **
    ***         ***
    ****     ****
    **********
*/
	public static void main(String[] args) 
	{
       
		for(int i=1;i<=5;i++)
		{
			for(int j=1; j<=i;j++)
			{
			  System.out.print("*");
			}
            for(int k=1; k<=2*(5-i);k++)  //2*(row-i) or try it with space
			{ 
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++)
			{
                  System.out.print("*");
			}
		System.out.println();
		//space-=2;
		
		}
                
}
}
