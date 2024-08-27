class prac15 
{
	/*
	 *
   ***
 *****
 */
	public static void main(String[] args) 
	{
		//int space =2 if needed
		int star=1;
		for(int i =1; i<=3;i++)
		{
			//for(int j=1; j<=space;j++)
			for(int j =2; j>=i;j--) // we are decrementing the space
			{
				System.out.print(" ");
			}
			for(int k =1;k<=star;k++)
			{
			     System.out.print("*");
			}
			System.out.println();
			//space--;
		    star+=2;
	}
}
}