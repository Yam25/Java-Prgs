class prac17
{
	/*
	    *
      ***
	*****
      ***
        *
		       */
	
	public static void main(String[] args) 
	{
		int space =2 ;
		int star=1;
		int i,j,k;
		for(i =1; i<=5;i++)
		{
			 for(j=1; j<=space;j++)
			
			{
				System.out.print(" ");
			}
			for(k =1;k<=star;k++)
			{
				System.out.print("*");
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
}
}