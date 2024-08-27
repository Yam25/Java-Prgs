/*
 A B C D E
 F G H I
 J K L
 M N
 O
-------------------
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */
class prac47 
{
	public static void main(String[] args) 
	{
		char c= 'A';
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
	System.out.println("-------------------");
	int st=5;
	for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=st;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println();
			st--;
		}
	}
}
