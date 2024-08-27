class prac36
{ 
	/*
    ******
      ******
        ******
           ******
              ******
                 ******  do it for left side
				 */
	public static void main(String[] args)
	{
		//int space=0;
		for(int i =1; i<=6;i++)
		{
			for(int k=1;k<=i-1;k++) //for(int k=5;k>=i-1;k--) for left side
			{
				System.out.print(" ");
			}
			for(int j =1; j<=6;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			//space++;
		}
	}
}