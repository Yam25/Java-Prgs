import java.util.Scanner;
class prac50 
{ // armstrong number generalized version
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int count=0;
		System.out.println("Enter a number");
		int num = sc.nextInt();
		int temp = num;
		int acnum = num;
		while(num>0)
		{
			num = num/10;
			count++;
		}
		while (temp>0)
		{
			int rem = temp%10;
			sum = sum + (int)Math.pow(rem,count);
			temp = temp/10;
		}
		if(sum==acnum)
			System.out.println("Its armstrong num");
		else
			System.out.println("Its not armstrong num");

	}
}
