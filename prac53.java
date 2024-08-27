class prac53 
{ // recursion factorial
	public static void main(String[] args) 
	{
		int num = 5;
		int n = fact(num);
		System.out.println("Factorial of 5 = "+n);
	}
	public static int fact(int n)
		{
			if (n == 0)    
             return 1;    
           else    
             return(n * fact(n-1));    
		}
}
