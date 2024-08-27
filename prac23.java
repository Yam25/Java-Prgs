class prac23
{
	/*
	 A
   BCD
 EFGHI
   JKL
     M
-------------------------------------
      M
    LKJ
  IHGFE
   DCB
      A
  */
	public static void main(String[] args) 
	{
		char c = 'A';
		int space =2;
		int star = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(c++);
			}
			System.out.println();
			if(i<3)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
	}
	System.out.println("-------------------------------------");
	   char d = 'M';
		int sp =2;
		int st = 1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=st;k++)
			{
				System.out.print(d--);
			}
			System.out.println();
			if(i<3)
			{
				sp--;
				st+=2;
			}
			else
			{
				sp++;
				st-=2;
			}
	}
}
}
