class prac34
{
	/*
	**********
    ****     ****
    ***         ***
     **            **
     *                *  and with alphabets 
*/
	public static void main(String[] args) 
	{
       int i,j;
	   char c = 'A';
	   char d = 'Z';
		for(i=1;i<=5;i++)
		{
			for(j=5; j>=i;j--)
			{
			  System.out.print(c++);
			}
            for(int k=1; k<=2*(i-1);k++)  //2*(i+j)/2  
			{ 
				System.out.print(" ");
			}
			for(int l=5;l>=i;l--)
			{
                  System.out.print(d--);
			}
		System.out.println();
		
		}
                
}
}
