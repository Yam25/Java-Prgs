
    /* 
 2
 4 6
 8 2 4
 6 8 2 4
 6 8 2 4 6
---------------------------
 A
 A B
 A B C
 A B C D
 A B C D E */

class prac43 
{
	public static void main(String[] args) 
	{
		int num=2;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" "+num);
				num+=2;
				if(num>8)
				{
					num=2;
				}
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		char d ='A' ;
		for(int k=1;k<=5;k++)
		{
          for(int l=1;l<=k;l++)
			{
			  System.out.print(" "+(char)(d+l-1));
			}
			System.out.println();
		}
	}
}
