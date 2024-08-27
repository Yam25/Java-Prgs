class prac32  
/* print A letter using star
                        *
					  *   *
					 *  *   *
					*          *
					 
*/
{
	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			
		  
			for(int j=1; j<=5;j++) 
			{
				if(j+i>5)
				{
				if(i==4 && j==2)
					{
				System.out.print("  ");
					}
					else
                   System.out.print(" * ");
				}
				
				else
					System.out.print(" ");
			}
			System.out.println();
			
		}
}
}