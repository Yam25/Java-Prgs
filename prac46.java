/*
 L M N O P
 Q R S T
 U V W
 X Y
 Z
--------------
 A B C D E
 A B C D
 A B C
 A B
 A
 */
class prac46 
{
	public static void main(String[] args) 
	{
		char c= 'L';
		int star =5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(" "+c++);
		}
		System.out.println();
		star--;
	}
	System.out.println("--------------");
	char d ='A' ;
	int st=5;
		for(int k=1;k<=5;k++)
		{
          for(int l=1;l<=st;l++)
			{
			  System.out.print(" "+(char)(d+l-1));
			}
			System.out.println();
			st--;
		}
	}
}
