class prac26 
{
	/*
	     
	ABCDE
	  ABC
	     A      and from Z too
	*/
	public static void main(String[] args) 
	{
		char c = 'A';
		int space = 0;
		int star = 5; 
		int j,i,k;
		for( i=1;i<=3;i++)
		{
			for(j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=star;k++)
			{
				System.out.print((char)(c+k-1)); //see here when printing this pattern in number, we used k , likewise use that k but add it to c and convert it to char.
			}
			System.out.println();
			space++; 
			star-=2; 
		}
		System.out.println("-----------------");
		char d = 'Z';
		int sp = 0; 
		int st = 5; 
		
		for( i=1;i<=3;i++)
		{
			for(j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(k=1;k<=st;k++)
			{
				System.out.print((char)(d-k+1)); //see here when printing this pattern in number, we used k , likewise use that k but add it to c and convert it to char.
			}
			System.out.println();
			sp++; 
			st-=2; 
		}
	}
}