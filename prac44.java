/*
Z
 Z Y
 Z Y X
 Z Y X W
 Z Y X W V
--------------
 Z Y X W V
 Z Y X W
 Z Y X
 Z Y
 Z
 */

class prac44 
{
	public static void main(String[] args) 
	{
		char d ='Z' ;
		for(int k=1;k<=5;k++)
		{
          for(int l=1;l<=k;l++)
			{
			  System.out.print(" "+(char)(d-l+1));
			}
			System.out.println();
		}System.out.println("--------------");
		char c= 'Z';
		int star =5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(" "+(char)(c-j+1));
		}
		System.out.println();
		star--;
	}
}
}