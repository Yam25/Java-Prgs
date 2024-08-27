class prac31 
{
	public static void main(String[] args) 
	{
		int no=5;
		char c='A';
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5)
				{
					System.out.print("*");
				}
				else if(no==j)
				{
					System.out.print("*");
				}
				else
					System.out.print(c++);
			}
			System.out.println();
			no--;
		}
	}
}
