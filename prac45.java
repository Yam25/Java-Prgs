/*
 A
 B C
 D E F
 G H I J
 K L M N O
---------------------------
 Z
 Y X
 W V U
 T S R Q
 P O N M L
 */

class prac45 
{
	public static void main(String[] args) 
	{
	char d ='A' ;
		for(int k=1;k<=5;k++)
		{
          for(int l=1;l<=k;l++)
			{
			  System.out.print(" "+d++);
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		char c ='Z' ;
		for(int i=1;i<=5;i++)
		{
          for(int j=1;j<=i;j++)
			{
			  System.out.print(" "+c--);
			}
			System.out.println();
		}
	}
}
