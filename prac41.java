import java.util.Scanner;
class prac41
{
	//product of given numbers
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		int prod=1;
		while(num>0)
		{
			int rem = num%10;
			prod = prod*rem;
		    num = num/10;
		}
       System.out.print(prod);
	}
}
