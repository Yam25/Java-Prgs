class star4
{
	/* H pattern but with alphabets 
	*/
	public static void main(String[] args) 
	{
		char c = 'A';
		for(int i =1; i<=5; i++)
		{
			for(int j =1;j<=5;j++)
			{
				if(i==3|| j==1 || j==5)
				{
					System.out.print(c++); // we are incrementing the character and widening type casting
				}
				else
					System.out.print(" ");
			}
			System.out.println();
	}

	System.out.println("--------------------------");
	char d = 'Z';
		for(int i =1; i<=6; i++)
		{
			for(int j =1;j<=5;j++)
			{
				if(i==3|| j==1 || j==5)
				{
					System.out.print(d--); // we are decrementing the character reverse alphabet order
				}
				else
					System.out.print(" ");
			}
			System.out.println();
	}
	}
}