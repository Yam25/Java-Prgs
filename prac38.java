import java.util.Scanner;
class  prac38
{
	//even or odd number - user input
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		System.out.println(num%2==0?"Even Number":"Odd Number");
		/*if(num%2==0)
			System.out.println("Even num");
		else
			System.out.println("Odd num");*/

	}
} 