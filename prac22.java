class prac22 
{
	/*
	 A
 BCD
EFGHI
-------------------------
IHGFE
 DCB
  A
  */
	public static void main(String[] args) 
	{
		char c = 'A';
		int space =2; 
		int star=1;
		for(int i =1; i<=3;i++)
		{
			for( int j=1; j<=space;j++)
			
			{
				System.out.print(" ");
			}
			for(int k =1;k<=star;k++)
			{
			     System.out.print(c++);
			}
			System.out.println();
			space--;
		    star+=2;
		}
	System.out.println("-------------------------");
	   char d = 'I';
		int sp =0 ;
		int st=5;
		for(int i =1; i<=3;i++)
		{
			 for(int j=1; j<=sp;j++)
			
			{
				System.out.print(" ");
			}
			for(int k =1;k<=st;k++)
			{
			     System.out.print(d--);
			}
			System.out.println();
			sp++;
		    st-=2;
	}
}
}
