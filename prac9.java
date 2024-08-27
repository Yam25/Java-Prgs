class prac9 
{
	public static void main(String[] args) 
	{
		char c = 'A';
		for(int i = 1; i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" " +c++);
			}
			System.out.println();
		}
		System.out.println("---------------------");
		char d = 'Z';
		for(int i = 1; i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" " +d--);
			}
			System.out.println();
		}
	}
}
