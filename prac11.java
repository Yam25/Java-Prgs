class prac11 
{
	public static void main(String[] args) 
	{
		char c ='A';
		for(int i =1; i<=5; i++)
		{
			for(int j =1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print(" "+c++);
				}
				else
					System.out.print("  ");
			}
			System.out.println();
	}
	System.out.println("---------------------------");
	char d ='P';
		for(int i =1; i<=5; i++)
		{
			for(int j =1;j<=5;j++)
			{
				if(i==1 || i==5 || j==1 || j==5)
				{
					System.out.print(" "+d--);
				}
				else
					System.out.print("  ");
			}
			System.out.println();
	}
	}
}
