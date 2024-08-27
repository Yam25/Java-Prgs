class prac12 
 {/* 
54321
5      4
5      4
5      4
54321 */
	public static void main(String[] args) 
	{
		int k =5; 
		for(int i =5 ; i>=1; i--)
		{
			for(int j=5; j>=1; j--)
			{
				if(i==1 || i==5)
				{
					System.out.print(j);
				}
				else if (j==5)
				{
					System.out.print(k);
				} 
				else if (j==1)
				{
					System.out.print(k-1);
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
