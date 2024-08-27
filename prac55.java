import java.util.Scanner;
class prac55 
{ //prime numbers
	public static void main(String[] args) 
	{
		boolean flag = true;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i =2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("Prime Number");
        else 
			System.out.println("Not a Prime Number");
	}
}