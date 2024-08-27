class prac10
{
	public static void main(String[] args) 
	{
		//int k =1; // we could either use new variable or just use j itself
		for(int i =1 ; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(i==1 || i==5 || j==1)
				{
					System.out.print(j);
				}
				/*else if (j==1)
				{
					System.out.print(k);
				} */
				else if (j==5)
				{
					System.out.print(j-3);
					//System.out.print(k+1);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
