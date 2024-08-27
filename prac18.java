class prac18
{
	/*
	  1
    123
  12345
 */
	public static void main(String[] args) 
	{
		int space =2; //if needed
		int star=1,i,j,k;
		for( i =1; i<=3;i++)
		{
			for( j=1; j<=space;j++)
			//for(int j =2; j>=i;j--) // we are decrementing the space
			{
				System.out.print(" ");
			}
			for(k =1;k<=star;k++)
			{
			     System.out.print(k);
			}
			System.out.println();
			space--;
		    star+=2;
	}
}
}