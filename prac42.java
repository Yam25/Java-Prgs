
/* 1
    1 2
    1 2 3
    1 2 3 4
    1 2 3 4 5
---------------------------
 1
 2 3
 4 5 6
 7 8 9 1
 2 3 4 5 6 */


class prac42 
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		int d =1 ;
		for(int k=1;k<=5;k++)
		{
          for(int l=1;l<=k;l++)
			{
			  System.out.print(" "+d++);
			  if(d>9)
				{
				  d=1;
				}
			}
			System.out.println();
		}

}
}
