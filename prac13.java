class prac13 
{
	/*
	 12345
	     1
		 1
		 1
      12345 
	  */
	public static void main(String[] args) 
	{
		int k =1;
		for(int i =1; i<=5; i++)
		{
			for(int j =1 ; j<=5; j++)
			{
				if(i==1 || i==5)
				{
				System.out.print(j);
				}
				else if (j==3)
				{
					System.out.print(k);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
