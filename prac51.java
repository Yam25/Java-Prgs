import java.util.Scanner;
class prac51 
{//armstrong number 3 digits
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a  3 digits number");
		int num = sc.nextInt();
		int acnum = num;
		while (num>0)
		{
			int rem = num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;
		}
		if(sum==acnum)
			System.out.println("Its armstrong num");
		else
			System.out.println("Its not armstrong num");

	}
}
