class prac14 
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
				if(i==3)
				{
					System.out.print(c++); // we are incrementing the character and widening type casting
				}
				else if (j==1)
				{
					System.out.print('A');
				}
				else if (j==5)
				{
					System.out.print('B');
				}
				else
					System.out.print(" ");
			}
			System.out.println();
	}

	}
}
