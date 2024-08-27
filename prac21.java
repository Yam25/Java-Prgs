class prac21
{
	/*
	     1
       234
     56789
       876
         5
		       */
	public static void main(String[] args) 
	{
		int num=1;
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
				if(i<=3)
				{
				System.out.print(num++);
				}
			  if (i>3)
				{
					 num--;
					 System.out.print(num-1);
					
				}
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
