class prac24 
{
	/*
	     A
	  ABC
	ABCDE and from Z too
	*/
	public static void main(String[] args) 
	{
		char c = 'A';
		int space = 2; //0
		int star = 1; //5
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
			space--; //space++
			star+=2; //star-=2
		}
		System.out.println("-----------------");
		char d = 'Z';
		int sp = 2; //0
		int st = 1; //5
		
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
			sp--; //space++
			st+=2; //star-=2
		}
	}
}
