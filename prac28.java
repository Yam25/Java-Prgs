class prac28 
{
	/*
	    *
      **
    ***
  ****
*****
*/
	public static void main(String[] args) 
	{
		
      //int space = 4; use either space variable and k for loop or use only two loops.
		for(int i=1;i<=5;i++)
		{
			int num=1;
		  /*for(int k=1;k<=space;k++)
			{
			  System.out.print(" ");
			}*/
			for(int j=1; j<=5;j++) //for(int j=1;j<=i;j++)
			{
				if(j+i>5)
				{
				System.out.print(num++);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			//space--;
		}
}
}