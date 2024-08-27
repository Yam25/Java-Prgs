class prac2 
{
	//print 1 to 100 without loop
	static int num=1;
	public static void main(String[] args) 
	{
		System.out.println(num++);
		if(num<=100)
			main(null);
	}
}
