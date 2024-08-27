class star3 
{
	/* 
	     * * * * *
               *
			   *
			   *
			   *
        * * * * * 
		or with alphabets
*/
	public static void main(String[] args) 
	{

		char c = 'A';
		for(int i =1; i<=6; i++)
		{
			for(int j =1;j<=5;j++)
			{
				if(i==1 || i==6 || j==3)
				{
					System.out.print(c++); //("*")
				}
				else
					System.out.print(" ");
			}
			System.out.println();
	}
	System.out.println("------------------------");
	char d = 'N';
		for(int i =1; i<=6; i++)
		{
			for(int j =1;j<=5;j++)
			{ 
				if(i==1 || i==6 || j==3)
				{
					System.out.print(d--); //("*")
				}
				else
					System.out.print(" ");
			}
			System.out.println();
	}
	}
}
