class prac20
{
	/*
	   1
     234
   56789
 */
	public static void main(String[] args) 
	{
		int num=1;
		int space =2; 
		int star=1,i,j,k;
		for( i =1; i<=3;i++)
		{
			for( j=1; j<=space;j++)
			
			{
				System.out.print(" ");
			}
			for(k =1;k<=star;k++)
			{
			     System.out.print(num++);
			}
			System.out.println();
			space--;
		    star+=2;
	}
}
}