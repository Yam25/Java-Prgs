class prac52 
{//fibonacci series
	public static void main(String[] args) 
	{
		int a = 0;
		int b=1;
		System.out.println("Fibonacci series: ");
		while(a<100)
		{
			System.out.print(a+" ");
		int c = a+b;
		a=b;
		b=c;
		}
	}
}
