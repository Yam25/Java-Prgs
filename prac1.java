class prac1 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		int n=10;
		for( i=0; i<n; i++)
		{
			for(j=n-1; j>=i; j--)
			{
				System.out.print(" ");
			}
			for( k=0; k<=i;k++)
			{
				if(k==0 || k==i || i==n-1)
				{
                System.out.print("* ");
				}
				else
				{
                     System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
